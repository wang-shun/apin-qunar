package com.apin.qunar.job.statistics;

import com.apin.qunar.common.utils.DateUtil;
import com.apin.qunar.order.common.enums.NtsOrderStatusEnum;
import com.apin.qunar.order.common.enums.OrderStatusEnum;
import com.apin.qunar.order.dao.impl.InternationalOrderDaoImpl;
import com.apin.qunar.order.dao.impl.NationalOrderDaoImpl;
import com.apin.qunar.statistics.dao.impl.DayMerchantStatisticsDaoImpl;
import com.apin.qunar.statistics.dao.impl.DayStatisticsDaoImpl;
import com.apin.qunar.statistics.dao.impl.InternationalSearchFlightRecordDaoImpl;
import com.apin.qunar.statistics.dao.impl.NationalSearchFlightRecordDaoImpl;
import com.apin.qunar.statistics.dao.model.DayMerchantStatistics;
import com.apin.qunar.statistics.dao.model.DayStatistics;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.*;

@Slf4j
@Component
public class MerchantStasticsJob {
    @Autowired
    private DayStatisticsDaoImpl dayStatisticsDao;
    @Autowired
    private DayMerchantStatisticsDaoImpl dayMerchantStatisticsDao;
    @Autowired
    private NationalSearchFlightRecordDaoImpl nationalSearchFlightRecordDao;
    @Autowired
    private InternationalSearchFlightRecordDaoImpl internationalSearchFlightRecordDao;
    @Autowired
    private NationalOrderDaoImpl nationalOrderDao;
    @Autowired
    private InternationalOrderDaoImpl internationalOrderDao;

    /**
     * 商户统计job启动
     */
    @Scheduled(cron = "0 0 1 * * *")
    private void start() {
        log.error("商户统计job开始执行,时间:" + DateUtil.getCurrDate());
        if (isExecute()) {
            return;
        }
        try {
            statistics();
        } catch (Exception e) {
            log.error("商户统计job执行失败", e);
        }
    }

    private void statistics() {
        List<Integer> orderStatus = Arrays.asList(OrderStatusEnum.TICKET_OK.getCode(), OrderStatusEnum.PAY_OK.getCode(), OrderStatusEnum.TICKET_LOCK.getCode(), OrderStatusEnum.CHANGE_OK.getCode());
        List<Integer> ntsOrderStatus = Arrays.asList(NtsOrderStatusEnum.TICKET_OK.getCode(), NtsOrderStatusEnum.PAY_OK.getCode());

        Date startTime = getStartTime();
        Date endTime = getEndTime();
        List<String> internationalAccounts = internationalSearchFlightRecordDao.queryAccountByInsertTime(startTime, endTime);
        List<String> nationalAccounts = nationalSearchFlightRecordDao.queryAccountByInsertTime(startTime, endTime);
        List<String> accounts = new ArrayList<>();
        accounts.addAll(internationalAccounts);
        accounts.addAll(nationalAccounts);
        if (CollectionUtils.isEmpty(accounts)) {
            return;
        }
        int flightCnt = 0;
        int ntsFlightCnt = 0;
        int totalOrderCnt = 0;
        int detalTotalAmount = 0;
        for (String account : accounts) {
            if (StringUtils.isBlank(account)) {
                continue;
            }
            int merFlightCnt = nationalSearchFlightRecordDao.queryFlightCntByMerchantNoAndInsertTime(account, startTime, endTime);
            int merOrderCnt = nationalOrderDao.queryCntBy(account, orderStatus, startTime, endTime);
            int merDealTotalAmount = nationalOrderDao.queryTotalAmountBy(account, orderStatus, startTime, endTime);

            int merNtsFlightCnt = internationalSearchFlightRecordDao.queryFlightCntByAccountAndInsertTime(account, startTime, endTime);
            int merNtsOrderCnt = internationalOrderDao.queryCntBy(account, ntsOrderStatus, startTime, endTime);
            int merNtsDealTotalAmount = internationalOrderDao.queryTotalAmountBy(account, orderStatus, startTime, endTime);

            DayMerchantStatistics merchantStatistics = buildDayMerchantStatistics(account, merFlightCnt, merNtsFlightCnt, merOrderCnt, merNtsOrderCnt, merDealTotalAmount, merNtsDealTotalAmount);
            dayMerchantStatisticsDao.insert(merchantStatistics);
            flightCnt += merFlightCnt;
            ntsFlightCnt = merNtsFlightCnt;
            totalOrderCnt += merOrderCnt + merNtsOrderCnt;
            detalTotalAmount += merDealTotalAmount + merNtsDealTotalAmount;
        }
        int pv = (flightCnt + ntsFlightCnt) * (new Random().nextInt(3) + 1) + new Random().nextInt(201);
        DayStatistics dayStatistics = buildDayStatistics(pv, accounts.size(), flightCnt, ntsFlightCnt, totalOrderCnt, detalTotalAmount);
        dayStatisticsDao.insert(dayStatistics);
    }

    private DayMerchantStatistics buildDayMerchantStatistics(String account, int flightCnt, int nstFlightCnt, int totalOrderCtn, int ntsOrderOrderCtn, int dealTotalAmount, int ntsDealTotalAmount) {
        DayMerchantStatistics dayMerchantStatistics = new DayMerchantStatistics();
        dayMerchantStatistics.setAccount(account);
        dayMerchantStatistics.setNationalSearchFlightCnt(flightCnt);
        dayMerchantStatistics.setInternationalSearchFlightCnt(nstFlightCnt);
        dayMerchantStatistics.setNationalDealOrderCnt(totalOrderCtn);
        dayMerchantStatistics.setInternationalDealOrderCnt(ntsOrderOrderCtn);
        dayMerchantStatistics.setNationalDealTotalAmount(dealTotalAmount);
        dayMerchantStatistics.setInternationalTotalAmount(ntsDealTotalAmount);
        return dayMerchantStatistics;
    }

    private DayStatistics buildDayStatistics(int pv, int uv, int flightCnt, int nstFlightCnt, int totalOrderCtn, int dealTotalAmount) {
        DayStatistics dayStatistics = new DayStatistics();
        dayStatistics.setTotalPv(pv);
        dayStatistics.setTotalUv(uv);
        dayStatistics.setSearchNationalFlightCnt(flightCnt);
        dayStatistics.setSearchInternationalFlightCnt(nstFlightCnt);
        dayStatistics.setDealOrderCnt(totalOrderCtn);
        dayStatistics.setDealTotalAmount(dealTotalAmount);
        return dayStatistics;
    }

    private boolean isExecute() {
        Date maxDate = dayMerchantStatisticsDao.queryMaxInsertTime();
        if (maxDate == null) {
            return false;
        }
        String currDate = DateUtil.format(new Date(), DateUtil.DEFAULT_DATE_DAYPATTERN);
        String maxDateFormat = DateUtil.format(maxDate, DateUtil.DEFAULT_DATE_DAYPATTERN);
        return currDate.equalsIgnoreCase(maxDateFormat);
    }

    private Date getStartTime() {
        Date date = DateUtil.getDateByYYYYMMDD(DateUtil.getCurrDate());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        return calendar.getTime();
    }

    private Date getEndTime() {
        return DateUtil.getDateByYYYYMMDD(DateUtil.getCurrDate());
    }
}

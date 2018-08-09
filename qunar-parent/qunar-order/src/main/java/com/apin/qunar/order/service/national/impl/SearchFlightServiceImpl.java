package com.apin.qunar.order.service.national.impl;

import com.alibaba.fastjson.JSON;
import com.apin.qunar.basic.service.impl.AirlineServiceImpl;
import com.apin.qunar.order.domain.common.ApiResult;
import com.apin.qunar.order.domain.national.searchFlight.FlightInfo;
import com.apin.qunar.order.domain.national.searchFlight.SearchFlightParam;
import com.apin.qunar.order.domain.national.searchFlight.SearchFlightResultVO;
import com.apin.qunar.order.service.national.SearchFlightService;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wangliang.wang on 2018/6/8.
 */
@Slf4j
@Service
public class SearchFlightServiceImpl extends ApiService<SearchFlightParam, ApiResult<SearchFlightResultVO>> implements SearchFlightService {
    @Autowired
    AirlineServiceImpl airlineService;

    @Override
    protected String getTag() {
        return "flight.national.supply.sl.searchflight";
    }

    @Override
    protected TypeReference<ApiResult<SearchFlightResultVO>> getTypeReference() {
        return new TypeReference<ApiResult<SearchFlightResultVO>>() {
        };
    }

    /**
     * 调用携程的航班查询接口.
     *
     * @param searchFlightParam 携程需要的对象。
     * @param merchantNo        商户号，系统注册的时候会分配.
     * @return 页面需要对象信息
     */
    @Override
    public ApiResult<SearchFlightResultVO> searchFlight(final SearchFlightParam searchFlightParam, final String merchantNo) {
        ApiResult<SearchFlightResultVO> apiResult = execute(searchFlightParam);
        if (apiResult == null) {
            return ApiResult.fail();
        }
        if (!apiResult.isSuccess()) {
            log.warn("查询国内航班异常,param:{},原因:{}", JSON.toJSON(searchFlightParam), apiResult.getMessage());
            return ApiResult.fail(apiResult.getCode(), apiResult.getMessage());
        }
        setAirlineName(apiResult.getResult(), merchantNo);
        return apiResult;
    }

    private void setAirlineName(SearchFlightResultVO searchFlightResult, String merchantNo) {
        List<FlightInfo> flightInfos = searchFlightResult.getFlightInfos();
        String airlineName = null;
        try {
            for (FlightInfo flightInfo : flightInfos) {
                airlineName = airlineService.getNameByCode(flightInfo.getCarrier());
                flightInfo.setCarrierName(airlineName);
                if (StringUtils.isNotBlank(flightInfo.getActFlightNum())) {
                    //加价逻辑
                    /// double ratio = merchantPriceConfigService.queryPriceRatio(merchantNo, true);
                    /// double barePriceValue = Double.parseDouble(flightInfo.getBarePrice()) * ratio;
                    /// flightInfo.setBarePrice(String.valueOf((int)barePriceValue));
                    String code = flightInfo.getActFlightNum().substring(0, 2);
                    airlineName = airlineService.getNameByCode(code);
                    flightInfo.setActFlightNum(airlineName + flightInfo.getActFlightNum());
                }
            }
        } catch (Exception e) {
            log.error("设置机场名称异常,params:{}", JSON.toJSON(searchFlightResult), e);
        }
    }

}
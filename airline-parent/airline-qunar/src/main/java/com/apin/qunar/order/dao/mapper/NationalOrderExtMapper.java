package com.apin.qunar.order.dao.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.Date;

/**
 * @outhor lujian
 * @create 2018-06-27 20:36
 */
public interface NationalOrderExtMapper {
    @Select("select count(1) from national_order where operator=#{account} and pay_status in (${payStatusStr}) and insert_time>=#{startTime} and insert_time<#{endTime}")
    int queryCntBy(@Param("account") String account, @Param("payStatusStr") String payStatusStr, @Param("startTime") Date startTime, @Param("endTime") Date endTime);

    @Select("select ifnull(sum(pay_amount),0) from national_order where operator=#{account} and pay_status in (${payStatusStr}) and insert_time>=#{startTime} and insert_time<#{endTime}")
    int queryTotalAmountBy(@Param("account") String account, @Param("payStatusStr") String payStatusStr, @Param("startTime") Date startTime, @Param("endTime") Date endTime);

    @Update("update national_order set pay_status=#{payStatus} where order_no=#{orderNo} and pay_status!=#{payStatus}")
    int updateStatus(@Param("orderNo") String orderNo, @Param("payStatus") int payStatus);

    @Update("update national_order set ticket_no=#{ticketNo},pay_status=#{payStatus} where order_no=#{orderNo}")
    int updateStatusAndTicketNo(@Param("orderNo") String orderNo, @Param("ticketNo") String ticketNo, @Param("payStatus") int payStatus);

    @Update("update national_order set pay_id=#{payId},pay_status=#{payStatus},pay_time=#{payTime} where order_no=#{orderNo}")
    int updatePayInfo(@Param("orderNo") String orderNo, @Param("payId") String payId, @Param("payStatus") int payStatus, @Param("payTime") String payTime);

    @Update("update national_order set ticket_no=replace(ticket_no,#{oldTicketNo},#{newTicketNo}) where order_no=#{orderNo}")
    int updateTicketNo(@Param("orderNo") String orderNo, @Param("oldTicketNo") String oldTicketNo, @Param("newTicketNo") String newTicketNo);

    @Update("update national_order set has_show=#{showStatus} where order_no=#{orderNo}")
    int updateShowStatus(@Param("orderNo") String orderNo, @Param("showStatus") int showStatus);

    @Update("update national_order set pay_type=#{payType} where order_no=#{orderNo}")
    int updatePayType(@Param("orderNo") String orderNo, @Param("payType") int payType);
}
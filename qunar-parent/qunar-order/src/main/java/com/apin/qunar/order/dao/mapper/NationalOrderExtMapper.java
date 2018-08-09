package com.apin.qunar.order.dao.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @outhor lujian
 * @create 2018-06-27 20:36
 */
public interface NationalOrderExtMapper {
    @Update("update national_order set pay_status=#{payStatus} where order_no=#{orderNo} and pay_status!=#{payStatus}")
    int updateStatus(@Param("orderNo") String orderNo, @Param("payStatus") int payStatus);

    @Update("update national_order set ticket_no=#{ticketNo},pay_status=#{payStatus} where order_no=#{orderNo}")
    int updateStatusAndTicketNo(@Param("orderNo") String orderNo, @Param("ticketNo") String ticketNo, @Param("payStatus") int payStatus);

    @Update("update national_order set pay_id=#{payId},pay_status=#{payStatus},pay_time=#{payTime} where order_no=#{orderNo}")
    int updatePayInfo(@Param("orderNo") String orderNo, @Param("payId") String payId, @Param("payStatus") int payStatus, @Param("payTime") String payTime);
}
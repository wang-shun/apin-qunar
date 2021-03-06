package com.apin.qunar.order.dao.mapper;

import com.apin.qunar.order.dao.model.NationalChangePassenger;
import com.apin.qunar.order.dao.model.NationalReturnPassenger;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @outhor ligang
 * @create 2018-07-30 09:31
 */
public interface NationalChangePassengerExtMapper {
    @Select("select order_no as orderNo,name from national_change_passenger where order_no in(${orderNos})")
    List<NationalChangePassenger> queryByOrderNo(@Param("orderNos") String orderNos);

    @Update("update national_change_passenger set order_no=#{orderNo} where order_no=#{parentOrderNo}")
    int updateByOrderNo(@Param("parentOrderNo") String parentOrderNo, @Param("orderNo") String orderNo);
}
package com.apin.qunar.order.domain.national.regularPassenger;


import lombok.Data;

/**
 * @outhor ligang
 * @create 2018-08-04 15:33
 */
@Data
public class RegularPassengerBO {

    private Long id;
    private String name;
    private int ageType;
    private String cardType;
    private String cardNo;
    private int gender;
    private String birthday;
    private String mobileNo;
    private String operator;
}

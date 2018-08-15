package com.apin.qunar.app.natioanl.request.change;

import com.apin.qunar.app.common.domain.BaseRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @outhor lujian
 * @create 2018-07-02 16:59
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ChangeApplyRequest extends BaseRequest {
    private String orderNo;
    private String changeCauseId;
    private String passengerIds;
    private String applyRemarks;
    private String uniqKey;
    private String gqFee;
    private String startTime;
    private String endTime;
    private String account;
    private String dptAirportCode;
    private String arrAirportCode;
    private String dptTerminal;
    private String arrTerminal;
    private String changeDate;
    private String flight;
    private String flightNo;
    private String flightType;
    private String startPlace;
    private String endPlace;
    private String cabin;
    private String cabinCode;
    private String carrier;
    private String upgradeFee;
    private String allFee;
    private String cabinStatus;
    private String actFlightNo;
    private String share;
}

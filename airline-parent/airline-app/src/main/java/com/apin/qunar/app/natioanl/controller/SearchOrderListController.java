package com.apin.qunar.app.natioanl.controller;

import com.alibaba.fastjson.JSON;
import com.apin.qunar.app.common.constant.AppConstants;
import com.apin.qunar.app.common.controller.BaseController;
import com.apin.qunar.app.common.domain.GeneralResultMap;
import com.apin.qunar.app.natioanl.request.SearchOrderListRequest;
import com.apin.qunar.common.enums.SysReturnCode;
import com.apin.qunar.order.domain.national.searchOrderList.NationalOrderVO;
import com.apin.qunar.order.service.national.SearchOrderListService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @outhor lujian
 * @create 2018-06-27 16:34
 * 查询订单列表
 */

@Slf4j
@RestController
@RequestMapping((AppConstants.ROOT_URL))
public class SearchOrderListController extends BaseController {
    @Autowired
    SearchOrderListService searchOrderListService;

    @PostMapping(value = "/order/list")
    public GeneralResultMap searchOrderList(@RequestBody SearchOrderListRequest request) {
        GeneralResultMap generalResultMap = validateCommonParam(request);
        if (!generalResultMap.isSuccess()) {
            log.warn("/order/list接口基础验证不通过，request:{}", JSON.toJSON(request));
            return generalResultMap;
        }
        Map<String, Object> data = new HashMap<>();
        if (request.getOffset() == null || request.getOffset() <= 0) {
            request.setOffset(0);
        }
        if (request.getLimit() == null || request.getLimit() <= 0) {
            request.setLimit(20);
        }
        try {
            List<NationalOrderVO> nationalOrderList = searchOrderListService.queryPageList(request.getMerchantNo(), request.getAccount(), request.getStatus(), request.getOrderNo(), request.getPessengerName(), request.getOffset(), request.getLimit());
            Integer count = searchOrderListService.queryCount(request.getMerchantNo(), request.getAccount(), request.getStatus(), request.getOrderNo(), request.getPessengerName());
            data.put("orderList", nationalOrderList);
            data.put("count", count);
            generalResultMap.setResult(SysReturnCode.SUCC, data);
        } catch (Exception e) {
            generalResultMap.setResult(SysReturnCode.FAIL);
            log.error("国内查询订单列表异常,request:{}", request, e);
        }
        return generalResultMap;
    }
}

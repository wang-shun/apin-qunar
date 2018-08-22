package com.apin.qunar.order.service.international;

import com.apin.qunar.order.domain.international.searchOrderList.InternationalOrderVO;

import java.util.List;

/**
 * @outhor lujian
 * @create 2018-07-27 6:45
 */
public interface NtsSearchOrderListService {
    List<InternationalOrderVO> queryPageList(String account, Integer status, Integer offset, Integer limit);
}
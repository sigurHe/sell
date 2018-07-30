package com.hb.sellsystem.service;

import com.hb.sellsystem.dto.OrderDTO;

/**
 * 买家
 * Created by HeBin on 2018\6\29 0029.
 */
public interface BuyerService {
    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);
    //取消订单
    OrderDTO cancleOrder(String openid, String orderId);

}

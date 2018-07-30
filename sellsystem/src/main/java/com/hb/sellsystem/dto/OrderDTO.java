package com.hb.sellsystem.dto;

import com.hb.sellsystem.entity.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by sigurHe
 * Date:2018/7/25.
 * Time:9:37.
 */
@Data
public class OrderDTO {
    /** 订单id */
    private String orderId;
    /** 买家姓名 */
    private String buyerName;
    /** 买家电话 */
    private String buyerPhone;
    /** 买家地址 */
    private String buyerAddress;
    /** 买家微信openid */
    private String buyerOpenid;
    /** 订单总金额 */
    private BigDecimal orderAmount;
    /** 订单状态，默认为新下单 */
    private Integer orderStatus;
    /** 支付状态 默认为0未支付 */
    private Integer payStatus;

    private List<OrderDetail> orderDetailList;
}

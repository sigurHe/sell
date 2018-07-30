package com.hb.sellsystem.enums;

import lombok.Getter;

/**
 * Created by sigurHe
 * Date:2018/7/25.
 * Time:9:14.
 */
@Getter
public enum OrderStatusEnum {

    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消");


    private Integer code;

    private String msg;

    OrderStatusEnum(Integer code,String msg) {
        this.code = code;
        this.msg = msg;
    }
}

package com.hb.sellsystem.enums;

import lombok.Getter;

/**
 * Created by sigurHe
 * Date:2018/7/24.
 * Time:15:05.
 */
@Getter
public enum ProductStatusEnum {

    UP(0,"正常"),
    DOWN(1,"下架"),
    ;
    private Integer code;

    private String msg;

    ProductStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}

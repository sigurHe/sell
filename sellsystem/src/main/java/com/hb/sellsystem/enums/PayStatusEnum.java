package com.hb.sellsystem.enums;

import lombok.Getter;

/**
 * Created by HeBin on 2018\6\29 0029.
 */
@Getter
public enum PayStatusEnum{

    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功"),
    ;

    private Integer code;

    private String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}

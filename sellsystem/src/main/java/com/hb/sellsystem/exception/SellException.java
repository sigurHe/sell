package com.hb.sellsystem.exception;

import com.hb.sellsystem.enums.ResultEnum;
import lombok.Getter;

/**
 * Created by HeBin on 2018\6\29 0029.
 */
@Getter
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }


}

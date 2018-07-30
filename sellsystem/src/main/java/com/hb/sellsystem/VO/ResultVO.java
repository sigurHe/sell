package com.hb.sellsystem.VO;

import lombok.Data;

/**
 * Created by sigurHe
 * Date:2018/7/24.
 * Time:16:01.
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private Object data;


}

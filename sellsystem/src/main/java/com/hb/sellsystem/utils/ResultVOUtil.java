package com.hb.sellsystem.utils;

import com.hb.sellsystem.VO.ResultVO;

/**
 * Created by sigurHe
 * Date:2018/7/24.
 * Time:20:18.
 */
public class ResultVOUtil {

    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setData(object);
        resultVO.setMsg("成功");
        return resultVO;
    }
    public static ResultVO success(){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setData(null);
        resultVO.setMsg("成功");
        return resultVO;
    }


    public static ResultVO error(Integer code,String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }

}

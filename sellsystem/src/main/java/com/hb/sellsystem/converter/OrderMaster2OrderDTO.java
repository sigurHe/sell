package com.hb.sellsystem.converter;

import com.hb.sellsystem.dto.OrderDTO;
import com.hb.sellsystem.entity.OrderMaster;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by sigurHe
 * Date:2018/7/30.
 * Time:11:05.
 */
public class OrderMaster2OrderDTO {

    public static OrderDTO convert(OrderMaster orderMaster){
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster,orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList){
        return orderMasterList.stream().map(orderMaster -> convert(orderMaster)).collect(Collectors.toList());
    }
}

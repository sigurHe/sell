package com.hb.sellsystem.service.impl;

import com.hb.sellsystem.SellsystemApplicationTests;
import com.hb.sellsystem.dto.OrderDTO;
import com.hb.sellsystem.service.OrderService;
import com.hb.sellsystem.service.PayService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by sigurHe
 * Date:2018/7/31.
 * Time:11:29.
 */

public class PayServiceImplTest extends SellsystemApplicationTests{
    @Autowired
    private PayService payService;
    @Autowired
    private OrderService orderService;


    @Test
    public void create() throws Exception {
        OrderDTO orderDTO = orderService.findOne("5836801532917573124");
        payService.create(orderDTO);


    }
    @Test
    public void refund(){
        OrderDTO orderDTO = orderService.findOne("9525221533035222658");
        payService.refund(orderDTO);

    }

}
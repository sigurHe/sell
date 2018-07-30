package com.hb.sellsystem.service.impl;

import com.hb.sellsystem.SellsystemApplicationTests;
import com.hb.sellsystem.dto.OrderDTO;
import com.hb.sellsystem.entity.OrderMaster;
import com.hb.sellsystem.repository.OrderMasterRepository;
import com.hb.sellsystem.service.OrderService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by sigurHe
 * Date:2018/7/30.
 * Time:20:14.
 */

public class OrderServiceImplTest extends SellsystemApplicationTests{

    @Autowired
    private OrderMasterRepository masterRepository;
    @Autowired
    private OrderService orderService;
    @Test
    public void create() throws Exception {
    }

    @Test
    public void findOne() throws Exception {
    }

    @Test
    public void findList() throws Exception {
    }

    @Test
    public void cancle() throws Exception {
    }

    @Test
    public void finish() throws Exception {
        OrderDTO orderDTO = orderService.findOne("9225531532949211437");
        OrderDTO result = orderService.finish(orderDTO);
        Assert.assertNotNull(result);
    }

    @Test
    public void paid() throws Exception {
        OrderDTO orderDTO = orderService.findOne("9225531532949211437");
        OrderDTO result = orderService.paid(orderDTO);
        Assert.assertNotNull(result);
    }

}
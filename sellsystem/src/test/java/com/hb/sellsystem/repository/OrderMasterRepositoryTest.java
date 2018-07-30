package com.hb.sellsystem.repository;

import com.hb.sellsystem.SellsystemApplicationTests;
import com.hb.sellsystem.entity.OrderMaster;
import com.hb.sellsystem.enums.OrderStatusEnum;
import com.hb.sellsystem.enums.PayStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by sigurHe
 * Date:2018/7/24.
 * Time:13:29.
 */
public class OrderMasterRepositoryTest extends SellsystemApplicationTests{

    @Autowired
    private OrderMasterRepository repository;

    @Test
    public void save(){
        OrderMaster orderMaster = new OrderMaster();

        orderMaster.setOrderId("123456");
        orderMaster.setBuyerName("张三");
        orderMaster.setBuyerPhone("13888886666");
        orderMaster.setBuyerAddress("road smart");
        orderMaster.setBuyerOpenid("abc");
        orderMaster.setOrderAmount(new BigDecimal(0.02));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());

        OrderMaster result = repository.save(orderMaster);
        Assert.assertNotNull(result);

    }

}
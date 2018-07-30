package com.hb.sellsystem.repository;

import com.hb.sellsystem.SellsystemApplicationTests;
import com.hb.sellsystem.entity.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by sigurHe
 * Date:2018/7/24.
 * Time:13:25.
 */
public class OrderDetailRepositoryTest extends SellsystemApplicationTests{

    @Autowired
    private OrderDetailRepository repository;


    @Test
    public void save(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrderId("123456");
        orderDetail.setDetailId("123456700");
        orderDetail.setProductName("猪肝面");
        orderDetail.setProductId("4635811532435627299");
        orderDetail.setProductPrice(new BigDecimal(0.01));
        orderDetail.setProductQuantity(1);
        orderDetail.setProductIcon("http://XXXX.jpg");

        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotNull(result);

    }


}
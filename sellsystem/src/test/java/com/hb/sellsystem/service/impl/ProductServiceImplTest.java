package com.hb.sellsystem.service.impl;

import com.hb.sellsystem.SellsystemApplicationTests;
import com.hb.sellsystem.entity.ProductInfo;
import com.hb.sellsystem.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by sigurHe
 * Date:2018/7/24.
 * Time:15:53.
 */
public class ProductServiceImplTest extends SellsystemApplicationTests{

    @Autowired
    private ProductService productService;
    @Test
    public void findUpAll() throws Exception {
        List<ProductInfo> result = productService.findUpAll();

        Assert.assertNotEquals(0,result.size());


    }

}
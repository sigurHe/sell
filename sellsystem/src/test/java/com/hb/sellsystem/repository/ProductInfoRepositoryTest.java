package com.hb.sellsystem.repository;

import com.hb.sellsystem.SellsystemApplicationTests;
import com.hb.sellsystem.entity.ProductInfo;
import com.hb.sellsystem.enums.ProductStatusEnum;
import com.hb.sellsystem.utils.KeyUtil;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

/**
 * Created by sigurHe
 * Date:2018/7/24.
 * Time:14:19.
 */
public class ProductInfoRepositoryTest extends SellsystemApplicationTests{

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void save(){

        ProductInfo productInfo = new ProductInfo();

        productInfo.setProductId(KeyUtil.generateKey());
        productInfo.setProductName("猪肝面");
        productInfo.setProductPrice(new BigDecimal(0.01));
        productInfo.setProductStock(200);
        productInfo.setProductDescription("好吃的片儿川");
        productInfo.setProductIcon("http://XXXX.jpg");
        productInfo.setProductStatus(ProductStatusEnum.UP.getCode());
        productInfo.setCategoryType(3);

        ProductInfo result = repository.save(productInfo);
        Assert.assertNotNull(result);



    }

}
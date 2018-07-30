package com.hb.sellsystem.repository;

import com.hb.sellsystem.SellsystemApplicationTests;
import com.hb.sellsystem.entity.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by sigurHe
 * Date:2018/7/24.
 * Time:13:55.
 */
public class ProductCategoryRepositoryTest extends SellsystemApplicationTests{


    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void save(){
        ProductCategory productCategory = new ProductCategory("面食",3);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
    }

}
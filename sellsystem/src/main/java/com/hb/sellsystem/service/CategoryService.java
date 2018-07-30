package com.hb.sellsystem.service;

import com.hb.sellsystem.entity.ProductCategory;

import java.util.List;
import java.util.Set;

/**
 * Created by sigurHe
 * Date:2018/7/24.
 * Time:16:50.
 */
public interface CategoryService {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}

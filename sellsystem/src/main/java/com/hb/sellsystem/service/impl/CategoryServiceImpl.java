package com.hb.sellsystem.service.impl;

import com.hb.sellsystem.entity.ProductCategory;
import com.hb.sellsystem.repository.ProductCategoryRepository;
import com.hb.sellsystem.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * Created by sigurHe
 * Date:2018/7/24.
 * Time:16:50.
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }
}

package com.hb.sellsystem.repository;

import com.hb.sellsystem.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

/**
 * Created by sigurHe
 * Date:2018/7/24.
 * Time:12:08.
 */
@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,String>{

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}

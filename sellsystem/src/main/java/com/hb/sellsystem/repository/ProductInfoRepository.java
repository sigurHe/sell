package com.hb.sellsystem.repository;

import com.hb.sellsystem.entity.ProductCategory;
import com.hb.sellsystem.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sigurHe
 * Date:2018/7/24.
 * Time:12:08.
 */
@Repository
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String>{

    List<ProductInfo> findByProductStatus(Integer productStatus);

}

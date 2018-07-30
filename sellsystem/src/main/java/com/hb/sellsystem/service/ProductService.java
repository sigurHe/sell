package com.hb.sellsystem.service;

import com.hb.sellsystem.dto.CartDTO;
import com.hb.sellsystem.entity.ProductInfo;

import java.util.List;

/**
 * Created by sigurHe
 * Date:2018/7/24.
 * Time:15:33.
 */
public interface ProductService {

    List<ProductInfo> findUpAll();


    //加库存
    void increaseStock(List<CartDTO> cartDTOList);
    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);

}

package com.hb.sellsystem.service.impl;

import com.hb.sellsystem.dto.CartDTO;
import com.hb.sellsystem.entity.ProductInfo;
import com.hb.sellsystem.enums.ProductStatusEnum;
import com.hb.sellsystem.enums.ResultEnum;
import com.hb.sellsystem.exception.SellException;
import com.hb.sellsystem.repository.ProductInfoRepository;
import com.hb.sellsystem.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Created by sigurHe
 * Date:2018/7/24.
 * Time:15:45.
 */
@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository repository;

    @Override
    public List<ProductInfo> findUpAll() {
        return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public void increaseStock(List<CartDTO> cartDTOList) {
        for(CartDTO cartDTO:cartDTOList){
            Optional<ProductInfo> productInfoOptional = repository.findById(cartDTO.getProductId());
            if(!productInfoOptional.isPresent()){
                log.error("【增加库存】商品不存在，productId={}",cartDTO.getProductId());
                throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
            }
            ProductInfo productInfo = productInfoOptional.get();
            productInfo.setProductStock(productInfo.getProductStock()+cartDTO.getProductQuantity());
            repository.save(productInfo);
        }
    }

    @Override
    @Transactional
    public void decreaseStock(List<CartDTO> cartDTOList) {
        for(CartDTO cartDTO:cartDTOList){
            Optional<ProductInfo> productInfoOptional = repository.findById(cartDTO.getProductId());
            if(!productInfoOptional.isPresent()){
                log.error("【减少库存】商品不存在，productId={}",cartDTO.getProductId());
                throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
            }
            ProductInfo productInfo = productInfoOptional.get();
            Integer result = productInfo.getProductStock() - cartDTO.getProductQuantity();
            if(result<0){
                log.error("【减少库存】库存不足");
                throw new SellException(ResultEnum.PRODUCT_STOCK_ERROR);
            }
            productInfo.setProductStock(result);
            repository.save(productInfo);
        }
    }
}

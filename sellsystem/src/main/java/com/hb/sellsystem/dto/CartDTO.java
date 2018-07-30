package com.hb.sellsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by sigurHe
 * Date:2018/7/30.
 * Time:16:23.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartDTO {

    private String productId;

    private Integer productQuantity;

}

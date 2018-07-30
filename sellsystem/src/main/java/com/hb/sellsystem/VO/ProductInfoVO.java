package com.hb.sellsystem.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by sigurHe
 * Date:2018/7/24.
 * Time:16:05.
 */
@Data
public class ProductInfoVO {


    @JsonProperty("id")
    private String productId;
    @JsonProperty("name")
    private String productName;
    @JsonProperty("price")
    private String productPrice;
    @JsonProperty("decription")
    private String productDescription;
    @JsonProperty("icon")
    private String productIcon;
}

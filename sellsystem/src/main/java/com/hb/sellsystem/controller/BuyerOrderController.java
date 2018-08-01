package com.hb.sellsystem.controller;

import com.hb.sellsystem.VO.ResultVO;
import com.hb.sellsystem.converter.OrderForm2OrderDTOConverter;
import com.hb.sellsystem.dto.OrderDTO;
import com.hb.sellsystem.entity.OrderMaster;
import com.hb.sellsystem.enums.ResultEnum;
import com.hb.sellsystem.exception.SellException;
import com.hb.sellsystem.form.OrderForm;
import com.hb.sellsystem.service.BuyerService;
import com.hb.sellsystem.service.OrderService;
import com.hb.sellsystem.utils.ResultVOUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.query.Param;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.xml.transform.Result;
import java.awt.print.Pageable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sigurHe
 * Date:2018/7/25.
 * Time:9:42.
 */
@RestController
@RequestMapping("/buyer/order")
@Slf4j
public class BuyerOrderController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private BuyerService buyerService;

    @PostMapping("/create")
    public ResultVO create(@Valid OrderForm orderForm, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            log.error("【创建订单】订单参数不正确，orderForm={}",orderForm);
            throw new SellException(ResultEnum.PARAM_ERROR.getCode(),bindingResult.getFieldError().getDefaultMessage());
        }
        OrderDTO orderDTO = OrderForm2OrderDTOConverter.convert(orderForm);
        if(CollectionUtils.isEmpty(orderDTO.getOrderDetailList())){
            log.error("【创建订单】购物车不能为空");
            throw new SellException(ResultEnum.CART_EMPTY);
        }
        OrderDTO result = orderService.create(orderDTO);
        Map<String,String> map = new HashMap<>();
        map.put("orderId",result.getOrderId());

        return ResultVOUtil.success(map);

    }

    @GetMapping("/list")
    public ResultVO list(@RequestParam("openid") String openid,
                         @RequestParam(value = "page",defaultValue = "0") Integer page,
                         @RequestParam(value = "size",defaultValue = "10") Integer size){
        //判断openid
        if(StringUtils.isEmpty(openid)){
            log.error("【查询订单列表】openid为空");
            throw new SellException(ResultEnum.PARAM_ERROR);
        }
        PageRequest pageRequest = PageRequest.of(page,size);
        Page<OrderDTO> orderDTOPage = orderService.findList(openid,pageRequest);
        return ResultVOUtil.success(orderDTOPage.getContent());
    }
    @GetMapping("detail")
    public ResultVO detail(@RequestParam("openid")String openid,
                           @RequestParam("orderId")String orderId){
        OrderDTO orderDTO = buyerService.findOrderOne(openid, orderId);
        return ResultVOUtil.success(orderDTO);
    }
    @PostMapping("/cancle")
    public ResultVO cancle(@RequestParam("openid")String openid,
                           @RequestParam("orderId")String orderId){
        buyerService.cancleOrder(openid,orderId);
        return ResultVOUtil.success();

    }


}

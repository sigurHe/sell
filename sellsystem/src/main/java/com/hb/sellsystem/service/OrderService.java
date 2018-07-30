package com.hb.sellsystem.service;

import com.hb.sellsystem.dto.OrderDTO;
import com.hb.sellsystem.form.OrderForm;
import org.hibernate.criterion.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by sigurHe
 * Date:2018/7/25.
 * Time:9:32.
 */
public interface OrderService {

    OrderDTO create(OrderDTO orderDTO);

    OrderDTO findOne(String orderId);

    Page<OrderDTO> findList(String openid, Pageable pageable);

    OrderDTO cancle(OrderDTO orderDTO);

    OrderDTO finish(OrderDTO orderDTO);

    OrderDTO paid(OrderDTO orderDTO);
}

package com.hb.sellsystem.repository;

import com.hb.sellsystem.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sigurHe
 * Date:2018/7/24.
 * Time:12:08.
 */
@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String>{

    List<OrderDetail> findByOrderId(String orderId);

}

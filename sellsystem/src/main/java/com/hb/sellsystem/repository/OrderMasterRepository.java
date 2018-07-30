package com.hb.sellsystem.repository;

import com.hb.sellsystem.entity.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sigurHe
 * Date:2018/7/24.
 * Time:12:08.
 */
@Repository
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String>{

    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid,Pageable pageable);
}

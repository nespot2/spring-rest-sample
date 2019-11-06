package com.nespot2.springrestsample.order.repository;

import com.nespot2.springrestsample.order.domain.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
}

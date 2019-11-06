package com.nespot2.springrestsample.order.repository;

import com.nespot2.springrestsample.order.domain.SimpleOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<SimpleOrder, Long> {
}

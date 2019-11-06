package com.nespot2.springrestsample.order.repository;

import com.nespot2.springrestsample.order.domain.OrderLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLogRepository extends JpaRepository<OrderLog, Long> {
}

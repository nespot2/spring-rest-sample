package com.nespot2.springrestsample.item.repository;

import com.nespot2.springrestsample.item.domain.ItemDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemDetailRepository extends JpaRepository<ItemDetail, Long> {
}

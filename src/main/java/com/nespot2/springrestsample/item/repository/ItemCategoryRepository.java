package com.nespot2.springrestsample.item.repository;


import com.nespot2.springrestsample.item.domain.ItemCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemCategoryRepository extends JpaRepository<ItemCategory, Long> {
}

package com.nespot2.springrestsample.item.repository;


import com.nespot2.springrestsample.item.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findAllByNameLike(String name);
}

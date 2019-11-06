package com.nespot2.springrestsample.item.service;

import com.nespot2.springrestsample.item.domain.dto.ItemDto;

import java.util.List;


public interface ItemService {
    /**
     * item 조회
     */
    List<ItemDto> allItemsByName(String name);
}

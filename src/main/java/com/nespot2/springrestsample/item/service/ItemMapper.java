package com.nespot2.springrestsample.item.service;


import com.nespot2.springrestsample.item.domain.Item;
import com.nespot2.springrestsample.item.domain.ItemCategory;
import com.nespot2.springrestsample.item.domain.dto.ItemCategoryDto;
import com.nespot2.springrestsample.item.domain.dto.ItemDto;

public interface ItemMapper {
    ItemCategoryDto map(ItemCategory itemCategory);

    ItemDto map(Item item);
}

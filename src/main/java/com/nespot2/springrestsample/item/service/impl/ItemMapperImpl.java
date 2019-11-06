package com.nespot2.springrestsample.item.service.impl;

import com.nespot2.springrestsample.item.domain.Item;
import com.nespot2.springrestsample.item.domain.ItemCategory;
import com.nespot2.springrestsample.item.domain.dto.ItemCategoryDto;
import com.nespot2.springrestsample.item.domain.dto.ItemDto;
import com.nespot2.springrestsample.item.service.ItemMapper;
import org.springframework.stereotype.Service;

@Service
public class ItemMapperImpl implements ItemMapper {
    @Override
    public ItemCategoryDto map(ItemCategory itemCategory) {
        return ItemCategoryDto.builder()
                .name(itemCategory.getName())
                .id(itemCategory.getId())
                .modifiedAt(itemCategory.getModifiedAt())
                .build();
    }

    @Override
    public ItemDto map(Item item) {
        return ItemDto.builder()
                .name(item.getName())
                .imageUrl(item.getImageUrl())
                .inventoryQuantity(item.getInventoryQuantity())
                .modifiedAt(item.getModifiedAt())
                .build();
    }
}

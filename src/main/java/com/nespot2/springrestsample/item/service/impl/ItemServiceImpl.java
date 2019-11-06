package com.nespot2.springrestsample.item.service.impl;

import com.nespot2.springrestsample.item.domain.Item;
import com.nespot2.springrestsample.item.domain.dto.ItemDto;
import com.nespot2.springrestsample.item.repository.ItemRepository;
import com.nespot2.springrestsample.item.service.ItemMapper;
import com.nespot2.springrestsample.item.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    private final ItemMapper itemMapper;

    @Override
    public List<ItemDto> allItemsByName(String name) {
        return itemRepository.findAllByNameLike(name + '%')
                .stream()
                .map(itemMapper::map)
                .collect(Collectors.toList());
    }
}

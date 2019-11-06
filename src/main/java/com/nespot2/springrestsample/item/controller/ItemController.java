package com.nespot2.springrestsample.item.controller;

import com.nespot2.springrestsample.api.domain.ApiResult;
import com.nespot2.springrestsample.item.domain.dto.ItemDto;
import com.nespot2.springrestsample.item.domain.dto.ItemParamDto;
import com.nespot2.springrestsample.item.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/items")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @PostMapping
    public ResponseEntity<ApiResult<ItemDto>> get(@RequestBody ItemParamDto itemParamDto) {
        final List<ItemDto> items = itemService.allItemsByName(itemParamDto.getName());
        return ApiResult.ok(items).mapperResponseEntity();

    }
}

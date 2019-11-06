package com.nespot2.springrestsample.item.domain.dto;

import lombok.*;

import java.time.OffsetDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class ItemDto {

    private long id;

    private String name;

    private String imageUrl;

    private int inventoryQuantity;

    private OffsetDateTime modifiedAt;

    @Builder
    public ItemDto(long id, String name, String imageUrl, int inventoryQuantity, OffsetDateTime modifiedAt) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.inventoryQuantity = inventoryQuantity;
        this.modifiedAt = modifiedAt;
    }
}

package com.nespot2.springrestsample.item.domain;

import com.nespot2.springrestsample.common.domain.YesNo;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String imageUrl;

    @Column(nullable = false)
    private int initQuantity;

    @Column(nullable = false)
    private int releasedQuantity;

    @Column(nullable = false)
    private int inventoryQuantity;

    @Column(nullable = false)
    private YesNo quickDeliveryYn;

    @Column(nullable = false)
    private OffsetDateTime modifiedAt;

    @Column(nullable = false)
    private OffsetDateTime createdAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_category_id")
    private ItemCategory itemCategory;

    @Builder
    public Item(String name, String imageUrl, int initQuantity, int releasedQuantity, int inventoryQuantity, YesNo quickDeliveryYn, OffsetDateTime modifiedAt, OffsetDateTime createdAt, ItemCategory itemCategory) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.initQuantity = initQuantity;
        this.releasedQuantity = releasedQuantity;
        this.inventoryQuantity = inventoryQuantity;
        this.quickDeliveryYn = quickDeliveryYn;
        this.modifiedAt = modifiedAt;
        this.createdAt = createdAt;
        this.itemCategory = itemCategory;
    }
}

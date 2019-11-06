package com.nespot2.springrestsample.item.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QItem is a Querydsl query type for Item
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QItem extends EntityPathBase<Item> {

    private static final long serialVersionUID = 2035314243L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QItem item = new QItem("item");

    public final DateTimePath<java.time.OffsetDateTime> createdAt = createDateTime("createdAt", java.time.OffsetDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath imageUrl = createString("imageUrl");

    public final NumberPath<Integer> initQuantity = createNumber("initQuantity", Integer.class);

    public final NumberPath<Integer> inventoryQuantity = createNumber("inventoryQuantity", Integer.class);

    public final QItemCategory itemCategory;

    public final DateTimePath<java.time.OffsetDateTime> modifiedAt = createDateTime("modifiedAt", java.time.OffsetDateTime.class);

    public final StringPath name = createString("name");

    public final EnumPath<com.nespot2.springrestsample.common.domain.YesNo> quickDeliveryYn = createEnum("quickDeliveryYn", com.nespot2.springrestsample.common.domain.YesNo.class);

    public final NumberPath<Integer> releasedQuantity = createNumber("releasedQuantity", Integer.class);

    public QItem(String variable) {
        this(Item.class, forVariable(variable), INITS);
    }

    public QItem(Path<? extends Item> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QItem(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QItem(PathMetadata metadata, PathInits inits) {
        this(Item.class, metadata, inits);
    }

    public QItem(Class<? extends Item> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.itemCategory = inits.isInitialized("itemCategory") ? new QItemCategory(forProperty("itemCategory")) : null;
    }

}


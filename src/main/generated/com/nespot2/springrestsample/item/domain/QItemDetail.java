package com.nespot2.springrestsample.item.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QItemDetail is a Querydsl query type for ItemDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QItemDetail extends EntityPathBase<ItemDetail> {

    private static final long serialVersionUID = 2094429300L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QItemDetail itemDetail = new QItemDetail("itemDetail");

    public final DateTimePath<java.time.OffsetDateTime> createdAt = createDateTime("createdAt", java.time.OffsetDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath inventoryNumber = createString("inventoryNumber");

    public final QItem item;

    public final DateTimePath<java.time.OffsetDateTime> modifiedAt = createDateTime("modifiedAt", java.time.OffsetDateTime.class);

    public final EnumPath<ItemStatus> status = createEnum("status", ItemStatus.class);

    public QItemDetail(String variable) {
        this(ItemDetail.class, forVariable(variable), INITS);
    }

    public QItemDetail(Path<? extends ItemDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QItemDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QItemDetail(PathMetadata metadata, PathInits inits) {
        this(ItemDetail.class, metadata, inits);
    }

    public QItemDetail(Class<? extends ItemDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.item = inits.isInitialized("item") ? new QItem(forProperty("item"), inits.get("item")) : null;
    }

}


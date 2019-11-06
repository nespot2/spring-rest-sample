package com.nespot2.springrestsample.order.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderDetail is a Querydsl query type for OrderDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QOrderDetail extends EntityPathBase<OrderDetail> {

    private static final long serialVersionUID = -142867690L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderDetail orderDetail = new QOrderDetail("orderDetail");

    public final DateTimePath<java.time.OffsetDateTime> createdAt = createDateTime("createdAt", java.time.OffsetDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.nespot2.springrestsample.item.domain.QItemDetail itemDetail;

    public final DateTimePath<java.time.OffsetDateTime> modifiedAt = createDateTime("modifiedAt", java.time.OffsetDateTime.class);

    public final QSimpleOrder order;

    public final EnumPath<OrderStatus> orderStatus = createEnum("orderStatus", OrderStatus.class);

    public QOrderDetail(String variable) {
        this(OrderDetail.class, forVariable(variable), INITS);
    }

    public QOrderDetail(Path<? extends OrderDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderDetail(PathMetadata metadata, PathInits inits) {
        this(OrderDetail.class, metadata, inits);
    }

    public QOrderDetail(Class<? extends OrderDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.itemDetail = inits.isInitialized("itemDetail") ? new com.nespot2.springrestsample.item.domain.QItemDetail(forProperty("itemDetail"), inits.get("itemDetail")) : null;
        this.order = inits.isInitialized("order") ? new QSimpleOrder(forProperty("order"), inits.get("order")) : null;
    }

}


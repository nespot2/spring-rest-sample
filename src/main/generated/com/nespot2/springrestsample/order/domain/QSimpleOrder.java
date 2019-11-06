package com.nespot2.springrestsample.order.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSimpleOrder is a Querydsl query type for SimpleOrder
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSimpleOrder extends EntityPathBase<SimpleOrder> {

    private static final long serialVersionUID = 1531072147L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSimpleOrder simpleOrder = new QSimpleOrder("simpleOrder");

    public final DateTimePath<java.time.OffsetDateTime> createdAt = createDateTime("createdAt", java.time.OffsetDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.nespot2.springrestsample.member.domain.QMember member;

    public final DateTimePath<java.time.OffsetDateTime> modifiedAt = createDateTime("modifiedAt", java.time.OffsetDateTime.class);

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final EnumPath<OrderStatus> status = createEnum("status", OrderStatus.class);

    public QSimpleOrder(String variable) {
        this(SimpleOrder.class, forVariable(variable), INITS);
    }

    public QSimpleOrder(Path<? extends SimpleOrder> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSimpleOrder(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSimpleOrder(PathMetadata metadata, PathInits inits) {
        this(SimpleOrder.class, metadata, inits);
    }

    public QSimpleOrder(Class<? extends SimpleOrder> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.nespot2.springrestsample.member.domain.QMember(forProperty("member")) : null;
    }

}


package com.nespot2.springrestsample.order.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderLog is a Querydsl query type for OrderLog
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QOrderLog extends EntityPathBase<OrderLog> {

    private static final long serialVersionUID = 1672230559L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderLog orderLog = new QOrderLog("orderLog");

    public final DateTimePath<java.time.OffsetDateTime> createdAt = createDateTime("createdAt", java.time.OffsetDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QSimpleOrder order;

    public final EnumPath<OrderStatus> orderStatus = createEnum("orderStatus", OrderStatus.class);

    public QOrderLog(String variable) {
        this(OrderLog.class, forVariable(variable), INITS);
    }

    public QOrderLog(Path<? extends OrderLog> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderLog(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderLog(PathMetadata metadata, PathInits inits) {
        this(OrderLog.class, metadata, inits);
    }

    public QOrderLog(Class<? extends OrderLog> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.order = inits.isInitialized("order") ? new QSimpleOrder(forProperty("order"), inits.get("order")) : null;
    }

}


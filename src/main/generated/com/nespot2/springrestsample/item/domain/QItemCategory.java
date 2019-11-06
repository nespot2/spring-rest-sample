package com.nespot2.springrestsample.item.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QItemCategory is a Querydsl query type for ItemCategory
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QItemCategory extends EntityPathBase<ItemCategory> {

    private static final long serialVersionUID = 1707646049L;

    public static final QItemCategory itemCategory = new QItemCategory("itemCategory");

    public final DateTimePath<java.time.OffsetDateTime> createdAt = createDateTime("createdAt", java.time.OffsetDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.time.OffsetDateTime> modifiedAt = createDateTime("modifiedAt", java.time.OffsetDateTime.class);

    public final StringPath name = createString("name");

    public QItemCategory(String variable) {
        super(ItemCategory.class, forVariable(variable));
    }

    public QItemCategory(Path<? extends ItemCategory> path) {
        super(path.getType(), path.getMetadata());
    }

    public QItemCategory(PathMetadata metadata) {
        super(ItemCategory.class, metadata);
    }

}


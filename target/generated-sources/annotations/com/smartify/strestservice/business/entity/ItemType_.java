package com.smartify.strestservice.business.entity;

import com.smartify.strestservice.business.entity.Item;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-06T18:53:23")
@StaticMetamodel(ItemType.class)
public class ItemType_ { 

    public static volatile SingularAttribute<ItemType, Date> createdAt;
    public static volatile SingularAttribute<ItemType, Integer> iditemType;
    public static volatile SingularAttribute<ItemType, Item> item;
    public static volatile SingularAttribute<ItemType, String> itemTypeName;
    public static volatile SingularAttribute<ItemType, Date> updatedAt;

}
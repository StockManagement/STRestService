package com.smartify.strestservice.business.entity;

import com.smartify.strestservice.business.entity.HeightUnit;
import com.smartify.strestservice.business.entity.Item;
import com.smartify.strestservice.business.entity.LengthUnit;
import com.smartify.strestservice.business.entity.WeightUnit;
import com.smartify.strestservice.business.entity.WidthUnit;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-17T14:24:09")
@StaticMetamodel(ItemSize.class)
public class ItemSize_ { 

    public static volatile SingularAttribute<ItemSize, HeightUnit> heightUnitId;
    public static volatile SingularAttribute<ItemSize, WidthUnit> widthUnitId;
    public static volatile SingularAttribute<ItemSize, Item> item;
    public static volatile SingularAttribute<ItemSize, Float> itemSizeWeight;
    public static volatile SingularAttribute<ItemSize, Integer> iditemSize;
    public static volatile SingularAttribute<ItemSize, Float> itemSizeWidth;
    public static volatile SingularAttribute<ItemSize, Float> itemSizeHeight;
    public static volatile SingularAttribute<ItemSize, String> itemSizeName;
    public static volatile SingularAttribute<ItemSize, Date> createdAt;
    public static volatile SingularAttribute<ItemSize, WeightUnit> weightUnitId;
    public static volatile SingularAttribute<ItemSize, LengthUnit> lengthUnitId;
    public static volatile SingularAttribute<ItemSize, Float> itemSizeLength;
    public static volatile SingularAttribute<ItemSize, Date> updatedAt;

}
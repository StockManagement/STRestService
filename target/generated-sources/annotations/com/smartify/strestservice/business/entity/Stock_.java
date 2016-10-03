package com.smartify.strestservice.business.entity;

import com.smartify.strestservice.business.entity.Branch;
import com.smartify.strestservice.business.entity.Item;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-29T23:36:24")
@StaticMetamodel(Stock.class)
public class Stock_ { 

    public static volatile SingularAttribute<Stock, Float> stockUnitCost;
    public static volatile SingularAttribute<Stock, Date> createdAt;
    public static volatile SingularAttribute<Stock, Branch> branchId;
    public static volatile SingularAttribute<Stock, Item> itemId;
    public static volatile SingularAttribute<Stock, Float> stockMaxPrice;
    public static volatile SingularAttribute<Stock, Integer> idstock;
    public static volatile SingularAttribute<Stock, Float> stockAverageUnitCost;
    public static volatile SingularAttribute<Stock, Float> stockMinPrice;
    public static volatile SingularAttribute<Stock, Date> updatedAt;

}
package com.smartify.strestservice.business.entity;

import com.smartify.strestservice.business.entity.Item;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-17T14:24:09")
@StaticMetamodel(Package.class)
public class Package_ { 

    public static volatile SingularAttribute<Package, Date> createdAt;
    public static volatile SingularAttribute<Package, Item> itemId;
    public static volatile SingularAttribute<Package, Integer> idpackage;
    public static volatile SingularAttribute<Package, Float> packagePrice;
    public static volatile SingularAttribute<Package, String> packageName;
    public static volatile SingularAttribute<Package, Integer> packageQuantity;
    public static volatile SingularAttribute<Package, Date> updatedAt;

}
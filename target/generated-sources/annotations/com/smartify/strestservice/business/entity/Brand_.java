package com.smartify.strestservice.business.entity;

import com.smartify.strestservice.business.entity.Item;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-21T14:29:15")
@StaticMetamodel(Brand.class)
public class Brand_ { 

    public static volatile SingularAttribute<Brand, Integer> idbrand;
    public static volatile SingularAttribute<Brand, Date> createdAt;
    public static volatile SingularAttribute<Brand, String> brandName;
    public static volatile SingularAttribute<Brand, Item> item;
    public static volatile SingularAttribute<Brand, Date> updatedAt;

}
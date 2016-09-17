package com.smartify.strestservice.business.entity;

import com.smartify.strestservice.business.entity.Item;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-17T14:24:09")
@StaticMetamodel(Country.class)
public class Country_ { 

    public static volatile SingularAttribute<Country, Date> createdAt;
    public static volatile SingularAttribute<Country, Item> item;
    public static volatile SingularAttribute<Country, Integer> idcountry;
    public static volatile SingularAttribute<Country, String> countryName;
    public static volatile SingularAttribute<Country, Date> updatedAt;

}
package com.smartify.strestservice.business.entity;

import com.smartify.strestservice.business.entity.Item;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-18T16:19:42")
@StaticMetamodel(Area.class)
public class Area_ { 

    public static volatile SingularAttribute<Area, Date> createdAt;
    public static volatile SingularAttribute<Area, Item> item;
    public static volatile SingularAttribute<Area, Integer> idarea;
    public static volatile SingularAttribute<Area, String> areaName;
    public static volatile SingularAttribute<Area, Date> updatedAt;

}
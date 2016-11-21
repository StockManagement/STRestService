package com.smartify.strestservice.business.entity;

import com.smartify.strestservice.business.entity.ItemSize;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-21T14:29:15")
@StaticMetamodel(WeightUnit.class)
public class WeightUnit_ { 

    public static volatile SingularAttribute<WeightUnit, Integer> idweightUnit;
    public static volatile SingularAttribute<WeightUnit, Date> createdAt;
    public static volatile SingularAttribute<WeightUnit, ItemSize> itemSize;
    public static volatile SingularAttribute<WeightUnit, String> weightUnitName;
    public static volatile SingularAttribute<WeightUnit, Date> updatedAt;

}
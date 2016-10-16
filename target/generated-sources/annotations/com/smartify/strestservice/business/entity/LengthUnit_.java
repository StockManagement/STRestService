package com.smartify.strestservice.business.entity;

import com.smartify.strestservice.business.entity.ItemSize;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-16T22:18:49")
@StaticMetamodel(LengthUnit.class)
public class LengthUnit_ { 

    public static volatile SingularAttribute<LengthUnit, Integer> idlengthUnit;
    public static volatile SingularAttribute<LengthUnit, String> lengthUnitName;
    public static volatile SingularAttribute<LengthUnit, Date> createdAt;
    public static volatile SingularAttribute<LengthUnit, Date> upadtedAt;
    public static volatile SingularAttribute<LengthUnit, ItemSize> itemSize;

}
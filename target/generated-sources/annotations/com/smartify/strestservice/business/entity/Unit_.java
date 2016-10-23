package com.smartify.strestservice.business.entity;

import com.smartify.strestservice.business.entity.OffreRequirement;
import com.smartify.strestservice.business.entity.OffreResult;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-23T14:43:14")
@StaticMetamodel(Unit.class)
public class Unit_ { 

    public static volatile SingularAttribute<Unit, Date> createdAt;
    public static volatile SingularAttribute<Unit, OffreResult> offreResult;
    public static volatile SingularAttribute<Unit, String> unitName;
    public static volatile SingularAttribute<Unit, OffreRequirement> offreRequirement;
    public static volatile SingularAttribute<Unit, Integer> idunit;
    public static volatile SingularAttribute<Unit, Date> updatedAt;

}
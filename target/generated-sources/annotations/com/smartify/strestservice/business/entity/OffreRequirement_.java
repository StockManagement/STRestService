package com.smartify.strestservice.business.entity;

import com.smartify.strestservice.business.entity.Item;
import com.smartify.strestservice.business.entity.Offre;
import com.smartify.strestservice.business.entity.Unit;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-23T14:43:14")
@StaticMetamodel(OffreRequirement.class)
public class OffreRequirement_ { 

    public static volatile SingularAttribute<OffreRequirement, Date> createdAt;
    public static volatile SingularAttribute<OffreRequirement, Item> itemId;
    public static volatile SingularAttribute<OffreRequirement, Integer> idoffreRequirement;
    public static volatile SingularAttribute<OffreRequirement, Integer> offreRequirementQuantity;
    public static volatile SingularAttribute<OffreRequirement, Offre> offreId;
    public static volatile SingularAttribute<OffreRequirement, Unit> unitId;
    public static volatile SingularAttribute<OffreRequirement, Date> updatedAt;

}
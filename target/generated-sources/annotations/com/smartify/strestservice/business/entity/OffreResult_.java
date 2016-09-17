package com.smartify.strestservice.business.entity;

import com.smartify.strestservice.business.entity.Item;
import com.smartify.strestservice.business.entity.Offre;
import com.smartify.strestservice.business.entity.Unit;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-17T11:56:55")
@StaticMetamodel(OffreResult.class)
public class OffreResult_ { 

    public static volatile SingularAttribute<OffreResult, Date> createdAt;
    public static volatile SingularAttribute<OffreResult, Item> itemId;
    public static volatile SingularAttribute<OffreResult, Integer> idoffreResult;
    public static volatile SingularAttribute<OffreResult, Offre> offreId;
    public static volatile SingularAttribute<OffreResult, Unit> unitId;
    public static volatile SingularAttribute<OffreResult, Integer> offreResultQuantity;
    public static volatile SingularAttribute<OffreResult, Date> updatedAt;

}
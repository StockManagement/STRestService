package com.smartify.strestservice.business.entity;

import com.smartify.strestservice.business.entity.OffreRequirement;
import com.smartify.strestservice.business.entity.OffreResult;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-17T11:56:55")
@StaticMetamodel(Offre.class)
public class Offre_ { 

    public static volatile SingularAttribute<Offre, OffreResult> offreResult;
    public static volatile SingularAttribute<Offre, String> offreDescription;
    public static volatile SingularAttribute<Offre, String> offreFrom;
    public static volatile SingularAttribute<Offre, Integer> idoffre;
    public static volatile SingularAttribute<Offre, String> offreCode;
    public static volatile SingularAttribute<Offre, String> offreTo;
    public static volatile SingularAttribute<Offre, OffreRequirement> offreRequirement;

}
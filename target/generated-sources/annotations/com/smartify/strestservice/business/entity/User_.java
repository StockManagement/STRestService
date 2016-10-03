package com.smartify.strestservice.business.entity;

import com.smartify.strestservice.business.entity.Landmark;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-29T23:36:24")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, Date> createdAt;
    public static volatile SingularAttribute<User, Integer> iduser;
    public static volatile SingularAttribute<User, String> phoneNumber;
    public static volatile SingularAttribute<User, String> description;
    public static volatile SingularAttribute<User, String> userName;
    public static volatile SingularAttribute<User, Date> updatedAt;
    public static volatile CollectionAttribute<User, Landmark> landmarkCollection;

}
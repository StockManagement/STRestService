package com.smartify.strestservice.business.entity;

import com.smartify.strestservice.business.entity.UserType;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-06T18:53:23")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, UserType> userTypeId;
    public static volatile SingularAttribute<User, Date> createdAt;
    public static volatile SingularAttribute<User, Integer> iduser;
    public static volatile SingularAttribute<User, String> phoneNumber;
    public static volatile SingularAttribute<User, String> description;
    public static volatile SingularAttribute<User, String> userName;
    public static volatile SingularAttribute<User, String> trackColor;
    public static volatile SingularAttribute<User, Date> updatedAt;

}
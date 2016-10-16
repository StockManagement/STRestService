package com.smartify.strestservice.business.entity;

import com.smartify.strestservice.business.entity.Item;
import com.smartify.strestservice.business.entity.Landmark;
import com.smartify.strestservice.business.entity.Transaction;
import com.smartify.strestservice.business.entity.UserType;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-16T22:18:49")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, UserType> userTypeId;
    public static volatile SingularAttribute<User, Integer> iduser;
    public static volatile SingularAttribute<User, Item> item;
    public static volatile SingularAttribute<User, Item> item2;
    public static volatile SingularAttribute<User, Item> item1;
    public static volatile SingularAttribute<User, String> description;
    public static volatile SingularAttribute<User, Transaction> transaction1;
    public static volatile SingularAttribute<User, String> userName;
    public static volatile SingularAttribute<User, String> trackColor;
    public static volatile CollectionAttribute<User, Landmark> landmarkCollection;
    public static volatile SingularAttribute<User, Date> createdAt;
    public static volatile SingularAttribute<User, String> phoneNumber;
    public static volatile SingularAttribute<User, Transaction> transaction;
    public static volatile SingularAttribute<User, Date> updatedAt;

}
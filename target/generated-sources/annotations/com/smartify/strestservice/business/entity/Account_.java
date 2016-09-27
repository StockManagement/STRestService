package com.smartify.strestservice.business.entity;

import com.smartify.strestservice.business.entity.Transaction;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-18T22:47:14")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-18T16:19:42")
>>>>>>> 6946e22ef843c3f6ce389b44fded0ae9848cc5be
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SingularAttribute<Account, Date> createdAt;
    public static volatile SingularAttribute<Account, String> accountName;
    public static volatile SingularAttribute<Account, Integer> idaccount;
    public static volatile SingularAttribute<Account, Transaction> transaction;
    public static volatile SingularAttribute<Account, Date> updatedAt;

}
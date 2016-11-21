package com.smartify.strestservice.business.entity;

import com.smartify.strestservice.business.entity.Transaction;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-21T14:29:15")
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SingularAttribute<Account, Date> createdAt;
    public static volatile SingularAttribute<Account, String> accountName;
    public static volatile SingularAttribute<Account, Integer> idaccount;
    public static volatile SingularAttribute<Account, Transaction> transaction;
    public static volatile SingularAttribute<Account, Date> updatedAt;

}
package com.smartify.strestservice.business.entity;

import com.smartify.strestservice.business.entity.Account;
import com.smartify.strestservice.business.entity.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-06T18:53:23")
@StaticMetamodel(Transaction.class)
public class Transaction_ { 

    public static volatile SingularAttribute<Transaction, Integer> idtransaction;
    public static volatile SingularAttribute<Transaction, Date> createdAt;
    public static volatile SingularAttribute<Transaction, Account> accountId;
    public static volatile SingularAttribute<Transaction, User> updatedBy;
    public static volatile SingularAttribute<Transaction, String> transactionInOut;
    public static volatile SingularAttribute<Transaction, User> createdBy;
    public static volatile SingularAttribute<Transaction, String> transactionNumber;
    public static volatile SingularAttribute<Transaction, String> transactionDescription;
    public static volatile SingularAttribute<Transaction, Date> transactionDate;
    public static volatile SingularAttribute<Transaction, Date> updatedAt;

}
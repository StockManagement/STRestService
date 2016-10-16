package com.smartify.strestservice.business.entity;

import com.smartify.strestservice.business.entity.Branch;
import com.smartify.strestservice.business.entity.Item;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-16T22:18:49")
@StaticMetamodel(TransactionDetails.class)
public class TransactionDetails_ { 

    public static volatile SingularAttribute<TransactionDetails, Date> expiryDate;
    public static volatile SingularAttribute<TransactionDetails, Date> createdAt;
    public static volatile SingularAttribute<TransactionDetails, Branch> branchId;
    public static volatile SingularAttribute<TransactionDetails, Item> itemId;
    public static volatile SingularAttribute<TransactionDetails, Date> productionDate;
    public static volatile SingularAttribute<TransactionDetails, String> transactionDetailsInOut;
    public static volatile SingularAttribute<TransactionDetails, Integer> idtransactionDetails;
    public static volatile SingularAttribute<TransactionDetails, Date> updatedAt;

}
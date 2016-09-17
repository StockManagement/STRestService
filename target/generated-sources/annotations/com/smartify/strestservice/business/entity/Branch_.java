package com.smartify.strestservice.business.entity;

import com.smartify.strestservice.business.entity.Stock;
import com.smartify.strestservice.business.entity.TransactionDetails;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-17T14:24:09")
@StaticMetamodel(Branch.class)
public class Branch_ { 

    public static volatile SingularAttribute<Branch, Date> createdAt;
    public static volatile SingularAttribute<Branch, TransactionDetails> transactionDetails;
    public static volatile SingularAttribute<Branch, Integer> idbranch;
    public static volatile SingularAttribute<Branch, String> branchName;
    public static volatile SingularAttribute<Branch, Stock> stock;
    public static volatile SingularAttribute<Branch, Date> updatedAt;

}
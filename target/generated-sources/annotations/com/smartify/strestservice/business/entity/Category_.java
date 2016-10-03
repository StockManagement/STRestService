package com.smartify.strestservice.business.entity;

import com.smartify.strestservice.business.entity.Category;
import com.smartify.strestservice.business.entity.Item;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-29T23:36:24")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SingularAttribute<Category, Date> createdAt;
    public static volatile SingularAttribute<Category, Item> item;
    public static volatile SingularAttribute<Category, Integer> idcategory;
    public static volatile SingularAttribute<Category, Category> categoryparentID;
    public static volatile SetAttribute<Category, Category> categorySet;
    public static volatile SingularAttribute<Category, String> categoryName;
    public static volatile SingularAttribute<Category, Date> updatedAt;

}
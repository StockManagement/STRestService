package com.smartify.strestservice.business.entity;

import com.smartify.strestservice.business.entity.Area;
import com.smartify.strestservice.business.entity.Brand;
import com.smartify.strestservice.business.entity.Category;
import com.smartify.strestservice.business.entity.Country;
import com.smartify.strestservice.business.entity.ItemSize;
import com.smartify.strestservice.business.entity.ItemType;
import com.smartify.strestservice.business.entity.OffreRequirement;
import com.smartify.strestservice.business.entity.OffreResult;
import com.smartify.strestservice.business.entity.Package;
import com.smartify.strestservice.business.entity.Stock;
import com.smartify.strestservice.business.entity.TransactionDetails;
import com.smartify.strestservice.business.entity.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-23T14:43:14")
@StaticMetamodel(Item.class)
public class Item_ { 

    public static volatile SingularAttribute<Item, Country> originCountryId;
    public static volatile SingularAttribute<Item, TransactionDetails> transactionDetails;
    public static volatile SingularAttribute<Item, String> itemColor;
    public static volatile SingularAttribute<Item, String> itemCode;
    public static volatile SingularAttribute<Item, OffreRequirement> offreRequirement;
    public static volatile SingularAttribute<Item, ItemSize> itemSizeId;
    public static volatile SingularAttribute<Item, User> deletedBy;
    public static volatile SingularAttribute<Item, Boolean> applyVat;
    public static volatile SingularAttribute<Item, Date> createdAt;
    public static volatile SingularAttribute<Item, String> itemName;
    public static volatile SingularAttribute<Item, Boolean> isDeleted;
    public static volatile SingularAttribute<Item, String> itemDescription;
    public static volatile SingularAttribute<Item, Stock> stock;
    public static volatile SingularAttribute<Item, ItemType> itemTypeId;
    public static volatile SingularAttribute<Item, Date> updatedAt;
    public static volatile SingularAttribute<Item, String> itemImageName;
    public static volatile SingularAttribute<Item, OffreResult> offreResult;
    public static volatile SingularAttribute<Item, User> updatedBy;
    public static volatile SingularAttribute<Item, String> itemBarcode;
    public static volatile SingularAttribute<Item, Package> package1;
    public static volatile SingularAttribute<Item, Integer> iditem;
    public static volatile SingularAttribute<Item, Date> deletedAt;
    public static volatile SingularAttribute<Item, Area> areaId;
    public static volatile SingularAttribute<Item, Float> itemVat;
    public static volatile SingularAttribute<Item, User> createdBy;
    public static volatile SingularAttribute<Item, Integer> barcodeTypeId;
    public static volatile SingularAttribute<Item, Brand> brandId;
    public static volatile SingularAttribute<Item, Integer> itemCurrentQuantity;
    public static volatile SingularAttribute<Item, Integer> itemCatalogPath;
    public static volatile SingularAttribute<Item, Category> categoryId;

}
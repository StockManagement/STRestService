/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockService;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ihab BERRO
 */
@Entity
@Table(name = "item")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Item.findAll", query = "SELECT i FROM Item i"),
    @NamedQuery(name = "Item.findByIditem", query = "SELECT i FROM Item i WHERE i.iditem = :iditem"),
    @NamedQuery(name = "Item.findByItemName", query = "SELECT i FROM Item i WHERE i.itemName = :itemName"),
    @NamedQuery(name = "Item.findByCreatedAt", query = "SELECT i FROM Item i WHERE i.createdAt = :createdAt"),
    @NamedQuery(name = "Item.findByUpdatedAt", query = "SELECT i FROM Item i WHERE i.updatedAt = :updatedAt"),
    @NamedQuery(name = "Item.findByItemCode", query = "SELECT i FROM Item i WHERE i.itemCode = :itemCode"),
    @NamedQuery(name = "Item.findByItemCatalogPath", query = "SELECT i FROM Item i WHERE i.itemCatalogPath = :itemCatalogPath"),
    @NamedQuery(name = "Item.findByItemBarcode", query = "SELECT i FROM Item i WHERE i.itemBarcode = :itemBarcode"),
    @NamedQuery(name = "Item.findByBarcodeTypeId", query = "SELECT i FROM Item i WHERE i.barcodeTypeId = :barcodeTypeId"),
    @NamedQuery(name = "Item.findByDeletedAt", query = "SELECT i FROM Item i WHERE i.deletedAt = :deletedAt"),
    @NamedQuery(name = "Item.findByIsDeleted", query = "SELECT i FROM Item i WHERE i.isDeleted = :isDeleted"),
    @NamedQuery(name = "Item.findByItemCurrentQuantity", query = "SELECT i FROM Item i WHERE i.itemCurrentQuantity = :itemCurrentQuantity"),
    @NamedQuery(name = "Item.findByItemVat", query = "SELECT i FROM Item i WHERE i.itemVat = :itemVat"),
    @NamedQuery(name = "Item.findByApplyVat", query = "SELECT i FROM Item i WHERE i.applyVat = :applyVat")})
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iditem")
    private Integer iditem;
    @Basic(optional = false)
    @Column(name = "item_name")
    private String itemName;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Basic(optional = false)
    @Column(name = "item_code")
    private String itemCode;
    @Lob
    @Column(name = "item_description")
    private String itemDescription;
    @Lob
    @Column(name = "item_image_name")
    private String itemImageName;
    @Column(name = "item_catalog_path")
    private Integer itemCatalogPath;
    @Column(name = "item_barcode")
    private String itemBarcode;
    @Basic(optional = false)
    @Column(name = "barcode_type_id")
    private int barcodeTypeId;
    @Lob
    @Column(name = "item_color")
    private String itemColor;
    @Column(name = "deleted_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedAt;
    @Column(name = "is_deleted")
    private Boolean isDeleted;
    @Column(name = "item_current_quantity")
    private Integer itemCurrentQuantity;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "item_vat")
    private Float itemVat;
    @Column(name = "apply_vat")
    private Boolean applyVat;
    @JoinColumn(name = "deleted_by", referencedColumnName = "iduser")
    @OneToOne(optional = false)
    private User deletedBy;
    @JoinColumn(name = "area_id", referencedColumnName = "idarea")
    @OneToOne(optional = false)
    private Area areaId;
    @JoinColumn(name = "brand_id", referencedColumnName = "idbrand")
    @OneToOne(optional = false)
    private Brand brandId;
    @JoinColumn(name = "category_id", referencedColumnName = "idcategory")
    @OneToOne(optional = false)
    private Category categoryId;
    @JoinColumn(name = "origin_country_id", referencedColumnName = "idcountry")
    @OneToOne(optional = false)
    private Country originCountryId;
    @JoinColumn(name = "created_by", referencedColumnName = "iduser")
    @OneToOne(optional = false)
    private User createdBy;
    @JoinColumn(name = "item_size_id", referencedColumnName = "iditem_size")
    @OneToOne(optional = false)
    private ItemSize itemSizeId;
    @JoinColumn(name = "item_type_id", referencedColumnName = "iditem_type")
    @OneToOne(optional = false)
    private ItemType itemTypeId;
    @JoinColumn(name = "updated_by", referencedColumnName = "iduser")
    @OneToOne(optional = false)
    private User updatedBy;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "itemId")
    private Package package1;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "itemId")
    private OffreResult offreResult;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "itemId")
    private TransactionDetails transactionDetails;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "itemId")
    private OffreRequirement offreRequirement;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "itemId")
    private Stock stock;

    public Item() {
    }

    public Item(Integer iditem) {
        this.iditem = iditem;
    }

    public Item(Integer iditem, String itemName, String itemCode, int barcodeTypeId) {
        this.iditem = iditem;
        this.itemName = itemName;
        this.itemCode = itemCode;
        this.barcodeTypeId = barcodeTypeId;
    }

    public Integer getIditem() {
        return iditem;
    }

    public void setIditem(Integer iditem) {
        this.iditem = iditem;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemImageName() {
        return itemImageName;
    }

    public void setItemImageName(String itemImageName) {
        this.itemImageName = itemImageName;
    }

    public Integer getItemCatalogPath() {
        return itemCatalogPath;
    }

    public void setItemCatalogPath(Integer itemCatalogPath) {
        this.itemCatalogPath = itemCatalogPath;
    }

    public String getItemBarcode() {
        return itemBarcode;
    }

    public void setItemBarcode(String itemBarcode) {
        this.itemBarcode = itemBarcode;
    }

    public int getBarcodeTypeId() {
        return barcodeTypeId;
    }

    public void setBarcodeTypeId(int barcodeTypeId) {
        this.barcodeTypeId = barcodeTypeId;
    }

    public String getItemColor() {
        return itemColor;
    }

    public void setItemColor(String itemColor) {
        this.itemColor = itemColor;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getItemCurrentQuantity() {
        return itemCurrentQuantity;
    }

    public void setItemCurrentQuantity(Integer itemCurrentQuantity) {
        this.itemCurrentQuantity = itemCurrentQuantity;
    }

    public Float getItemVat() {
        return itemVat;
    }

    public void setItemVat(Float itemVat) {
        this.itemVat = itemVat;
    }

    public Boolean getApplyVat() {
        return applyVat;
    }

    public void setApplyVat(Boolean applyVat) {
        this.applyVat = applyVat;
    }

    public User getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(User deletedBy) {
        this.deletedBy = deletedBy;
    }

    public Area getAreaId() {
        return areaId;
    }

    public void setAreaId(Area areaId) {
        this.areaId = areaId;
    }

    public Brand getBrandId() {
        return brandId;
    }

    public void setBrandId(Brand brandId) {
        this.brandId = brandId;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
    }

    public Country getOriginCountryId() {
        return originCountryId;
    }

    public void setOriginCountryId(Country originCountryId) {
        this.originCountryId = originCountryId;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public ItemSize getItemSizeId() {
        return itemSizeId;
    }

    public void setItemSizeId(ItemSize itemSizeId) {
        this.itemSizeId = itemSizeId;
    }

    public ItemType getItemTypeId() {
        return itemTypeId;
    }

    public void setItemTypeId(ItemType itemTypeId) {
        this.itemTypeId = itemTypeId;
    }

    public User getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(User updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Package getPackage1() {
        return package1;
    }

    public void setPackage1(Package package1) {
        this.package1 = package1;
    }

    public OffreResult getOffreResult() {
        return offreResult;
    }

    public void setOffreResult(OffreResult offreResult) {
        this.offreResult = offreResult;
    }

    public TransactionDetails getTransactionDetails() {
        return transactionDetails;
    }

    public void setTransactionDetails(TransactionDetails transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    public OffreRequirement getOffreRequirement() {
        return offreRequirement;
    }

    public void setOffreRequirement(OffreRequirement offreRequirement) {
        this.offreRequirement = offreRequirement;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iditem != null ? iditem.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Item)) {
            return false;
        }
        Item other = (Item) object;
        if ((this.iditem == null && other.iditem != null) || (this.iditem != null && !this.iditem.equals(other.iditem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StockService.Item[ iditem=" + iditem + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartify.strestservice.business.entity;

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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ajaafar
 */
@Entity
@Table(name = "item_size")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItemSize.findAll", query = "SELECT i FROM ItemSize i"),
    @NamedQuery(name = "ItemSize.findByIditemSize", query = "SELECT i FROM ItemSize i WHERE i.iditemSize = :iditemSize"),
    @NamedQuery(name = "ItemSize.findByItemSizeName", query = "SELECT i FROM ItemSize i WHERE i.itemSizeName = :itemSizeName"),
    @NamedQuery(name = "ItemSize.findByCreatedAt", query = "SELECT i FROM ItemSize i WHERE i.createdAt = :createdAt"),
    @NamedQuery(name = "ItemSize.findByUpdatedAt", query = "SELECT i FROM ItemSize i WHERE i.updatedAt = :updatedAt"),
    @NamedQuery(name = "ItemSize.findByItemSizeHeight", query = "SELECT i FROM ItemSize i WHERE i.itemSizeHeight = :itemSizeHeight"),
    @NamedQuery(name = "ItemSize.findByItemSizeLength", query = "SELECT i FROM ItemSize i WHERE i.itemSizeLength = :itemSizeLength"),
    @NamedQuery(name = "ItemSize.findByItemSizeWidth", query = "SELECT i FROM ItemSize i WHERE i.itemSizeWidth = :itemSizeWidth"),
    @NamedQuery(name = "ItemSize.findByItemSizeWeight", query = "SELECT i FROM ItemSize i WHERE i.itemSizeWeight = :itemSizeWeight")})
public class ItemSize implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iditem_size")
    private Integer iditemSize;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "item_size_name")
    private String itemSizeName;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "item_size_height")
    private Float itemSizeHeight;
    @Column(name = "item_size_length")
    private Float itemSizeLength;
    @Column(name = "item_size_width")
    private Float itemSizeWidth;
    @Column(name = "item_size_weight")
    private Float itemSizeWeight;
    @JoinColumn(name = "height_unit_id", referencedColumnName = "idheight_unit")
    @OneToOne(optional = false)
    private HeightUnit heightUnitId;
    @JoinColumn(name = "length_unit_id", referencedColumnName = "idlength_unit")
    @OneToOne(optional = false)
    private LengthUnit lengthUnitId;
    @JoinColumn(name = "weight_unit_id", referencedColumnName = "idweight_unit")
    @OneToOne(optional = false)
    private WeightUnit weightUnitId;
    @JoinColumn(name = "width_unit_id", referencedColumnName = "idwidth_unit")
    @OneToOne(optional = false)
    private WidthUnit widthUnitId;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "itemSizeId")
    private Item item;

    public ItemSize() {
    }

    public ItemSize(Integer iditemSize) {
        this.iditemSize = iditemSize;
    }

    public ItemSize(Integer iditemSize, String itemSizeName) {
        this.iditemSize = iditemSize;
        this.itemSizeName = itemSizeName;
    }

    public Integer getIditemSize() {
        return iditemSize;
    }

    public void setIditemSize(Integer iditemSize) {
        this.iditemSize = iditemSize;
    }

    public String getItemSizeName() {
        return itemSizeName;
    }

    public void setItemSizeName(String itemSizeName) {
        this.itemSizeName = itemSizeName;
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

    public Float getItemSizeHeight() {
        return itemSizeHeight;
    }

    public void setItemSizeHeight(Float itemSizeHeight) {
        this.itemSizeHeight = itemSizeHeight;
    }

    public Float getItemSizeLength() {
        return itemSizeLength;
    }

    public void setItemSizeLength(Float itemSizeLength) {
        this.itemSizeLength = itemSizeLength;
    }

    public Float getItemSizeWidth() {
        return itemSizeWidth;
    }

    public void setItemSizeWidth(Float itemSizeWidth) {
        this.itemSizeWidth = itemSizeWidth;
    }

    public Float getItemSizeWeight() {
        return itemSizeWeight;
    }

    public void setItemSizeWeight(Float itemSizeWeight) {
        this.itemSizeWeight = itemSizeWeight;
    }

    public HeightUnit getHeightUnitId() {
        return heightUnitId;
    }

    public void setHeightUnitId(HeightUnit heightUnitId) {
        this.heightUnitId = heightUnitId;
    }

    public LengthUnit getLengthUnitId() {
        return lengthUnitId;
    }

    public void setLengthUnitId(LengthUnit lengthUnitId) {
        this.lengthUnitId = lengthUnitId;
    }

    public WeightUnit getWeightUnitId() {
        return weightUnitId;
    }

    public void setWeightUnitId(WeightUnit weightUnitId) {
        this.weightUnitId = weightUnitId;
    }

    public WidthUnit getWidthUnitId() {
        return widthUnitId;
    }

    public void setWidthUnitId(WidthUnit widthUnitId) {
        this.widthUnitId = widthUnitId;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iditemSize != null ? iditemSize.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemSize)) {
            return false;
        }
        ItemSize other = (ItemSize) object;
        if ((this.iditemSize == null && other.iditemSize != null) || (this.iditemSize != null && !this.iditemSize.equals(other.iditemSize))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smartify.strestservice.business.entity.ItemSize[ iditemSize=" + iditemSize + " ]";
    }
    
}

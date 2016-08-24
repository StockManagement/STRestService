/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartify.strestservice;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "item_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItemType.findAll", query = "SELECT i FROM ItemType i"),
    @NamedQuery(name = "ItemType.findByIditemType", query = "SELECT i FROM ItemType i WHERE i.iditemType = :iditemType"),
    @NamedQuery(name = "ItemType.findByItemTypeName", query = "SELECT i FROM ItemType i WHERE i.itemTypeName = :itemTypeName"),
    @NamedQuery(name = "ItemType.findByCreatedAt", query = "SELECT i FROM ItemType i WHERE i.createdAt = :createdAt"),
    @NamedQuery(name = "ItemType.findByUpdatedAt", query = "SELECT i FROM ItemType i WHERE i.updatedAt = :updatedAt")})
public class ItemType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iditem_type")
    private Integer iditemType;
    @Basic(optional = false)
    @Column(name = "item_type_name")
    private String itemTypeName;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "itemTypeId")
    private Item item;

    public ItemType() {
    }

    public ItemType(Integer iditemType) {
        this.iditemType = iditemType;
    }

    public ItemType(Integer iditemType, String itemTypeName) {
        this.iditemType = iditemType;
        this.itemTypeName = itemTypeName;
    }

    public Integer getIditemType() {
        return iditemType;
    }

    public void setIditemType(Integer iditemType) {
        this.iditemType = iditemType;
    }

    public String getItemTypeName() {
        return itemTypeName;
    }

    public void setItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName;
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

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iditemType != null ? iditemType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemType)) {
            return false;
        }
        ItemType other = (ItemType) object;
        if ((this.iditemType == null && other.iditemType != null) || (this.iditemType != null && !this.iditemType.equals(other.iditemType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smartify.strestservice.ItemType[ iditemType=" + iditemType + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartify.strestservice.business.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
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
@Table(name = "package")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Package.findAll", query = "SELECT p FROM Package p"),
    @NamedQuery(name = "Package.findByIdpackage", query = "SELECT p FROM Package p WHERE p.idpackage = :idpackage"),
    @NamedQuery(name = "Package.findByPackageName", query = "SELECT p FROM Package p WHERE p.packageName = :packageName"),
    @NamedQuery(name = "Package.findByPackageQuantity", query = "SELECT p FROM Package p WHERE p.packageQuantity = :packageQuantity"),
    @NamedQuery(name = "Package.findByPackagePrice", query = "SELECT p FROM Package p WHERE p.packagePrice = :packagePrice"),
    @NamedQuery(name = "Package.findByCreatedAt", query = "SELECT p FROM Package p WHERE p.createdAt = :createdAt"),
    @NamedQuery(name = "Package.findByUpdatedAt", query = "SELECT p FROM Package p WHERE p.updatedAt = :updatedAt")})
public class Package implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpackage")
    private Integer idpackage;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "package_name")
    private String packageName;
    @Column(name = "package_quantity")
    private Integer packageQuantity;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "package_price")
    private Float packagePrice;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @JoinColumn(name = "item_id", referencedColumnName = "iditem")
    @OneToOne(optional = false)
    private Item itemId;

    public Package() {
    }

    public Package(Integer idpackage) {
        this.idpackage = idpackage;
    }

    public Package(Integer idpackage, String packageName) {
        this.idpackage = idpackage;
        this.packageName = packageName;
    }

    public Integer getIdpackage() {
        return idpackage;
    }

    public void setIdpackage(Integer idpackage) {
        this.idpackage = idpackage;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Integer getPackageQuantity() {
        return packageQuantity;
    }

    public void setPackageQuantity(Integer packageQuantity) {
        this.packageQuantity = packageQuantity;
    }

    public Float getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(Float packagePrice) {
        this.packagePrice = packagePrice;
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

    public Item getItemId() {
        return itemId;
    }

    public void setItemId(Item itemId) {
        this.itemId = itemId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpackage != null ? idpackage.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Package)) {
            return false;
        }
        Package other = (Package) object;
        if ((this.idpackage == null && other.idpackage != null) || (this.idpackage != null && !this.idpackage.equals(other.idpackage))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smartify.strestservice.business.entity.Package[ idpackage=" + idpackage + " ]";
    }
    
}

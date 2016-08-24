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
@Table(name = "weight_unit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WeightUnit.findAll", query = "SELECT w FROM WeightUnit w"),
    @NamedQuery(name = "WeightUnit.findByIdweightUnit", query = "SELECT w FROM WeightUnit w WHERE w.idweightUnit = :idweightUnit"),
    @NamedQuery(name = "WeightUnit.findByWeightUnitName", query = "SELECT w FROM WeightUnit w WHERE w.weightUnitName = :weightUnitName"),
    @NamedQuery(name = "WeightUnit.findByCreatedAt", query = "SELECT w FROM WeightUnit w WHERE w.createdAt = :createdAt"),
    @NamedQuery(name = "WeightUnit.findByUpdatedAt", query = "SELECT w FROM WeightUnit w WHERE w.updatedAt = :updatedAt")})
public class WeightUnit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idweight_unit")
    private Integer idweightUnit;
    @Basic(optional = false)
    @Column(name = "weight_unit_name")
    private String weightUnitName;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "weightUnitId")
    private ItemSize itemSize;

    public WeightUnit() {
    }

    public WeightUnit(Integer idweightUnit) {
        this.idweightUnit = idweightUnit;
    }

    public WeightUnit(Integer idweightUnit, String weightUnitName) {
        this.idweightUnit = idweightUnit;
        this.weightUnitName = weightUnitName;
    }

    public Integer getIdweightUnit() {
        return idweightUnit;
    }

    public void setIdweightUnit(Integer idweightUnit) {
        this.idweightUnit = idweightUnit;
    }

    public String getWeightUnitName() {
        return weightUnitName;
    }

    public void setWeightUnitName(String weightUnitName) {
        this.weightUnitName = weightUnitName;
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

    public ItemSize getItemSize() {
        return itemSize;
    }

    public void setItemSize(ItemSize itemSize) {
        this.itemSize = itemSize;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idweightUnit != null ? idweightUnit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WeightUnit)) {
            return false;
        }
        WeightUnit other = (WeightUnit) object;
        if ((this.idweightUnit == null && other.idweightUnit != null) || (this.idweightUnit != null && !this.idweightUnit.equals(other.idweightUnit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smartify.strestservice.WeightUnit[ idweightUnit=" + idweightUnit + " ]";
    }
    
}

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
@Table(name = "height_unit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HeightUnit.findAll", query = "SELECT h FROM HeightUnit h")})
public class HeightUnit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idheight_unit")
    private Integer idheightUnit;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "height_unit_name")
    private String heightUnitName;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "heightUnitId")
    private ItemSize itemSize;

    public HeightUnit() {
    }

    public HeightUnit(Integer idheightUnit) {
        this.idheightUnit = idheightUnit;
    }

    public HeightUnit(Integer idheightUnit, String heightUnitName) {
        this.idheightUnit = idheightUnit;
        this.heightUnitName = heightUnitName;
    }

    public Integer getIdheightUnit() {
        return idheightUnit;
    }

    public void setIdheightUnit(Integer idheightUnit) {
        this.idheightUnit = idheightUnit;
    }

    public String getHeightUnitName() {
        return heightUnitName;
    }

    public void setHeightUnitName(String heightUnitName) {
        this.heightUnitName = heightUnitName;
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
        hash += (idheightUnit != null ? idheightUnit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HeightUnit)) {
            return false;
        }
        HeightUnit other = (HeightUnit) object;
        if ((this.idheightUnit == null && other.idheightUnit != null) || (this.idheightUnit != null && !this.idheightUnit.equals(other.idheightUnit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smartify.strestservice.business.entity.HeightUnit[ idheightUnit=" + idheightUnit + " ]";
    }
    
}

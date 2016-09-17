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
@Table(name = "length_unit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LengthUnit.findAll", query = "SELECT l FROM LengthUnit l")})
public class LengthUnit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idlength_unit")
    private Integer idlengthUnit;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "length_unit_name")
    private String lengthUnitName;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "upadted_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date upadtedAt;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "lengthUnitId")
    private ItemSize itemSize;

    public LengthUnit() {
    }

    public LengthUnit(Integer idlengthUnit) {
        this.idlengthUnit = idlengthUnit;
    }

    public LengthUnit(Integer idlengthUnit, String lengthUnitName) {
        this.idlengthUnit = idlengthUnit;
        this.lengthUnitName = lengthUnitName;
    }

    public Integer getIdlengthUnit() {
        return idlengthUnit;
    }

    public void setIdlengthUnit(Integer idlengthUnit) {
        this.idlengthUnit = idlengthUnit;
    }

    public String getLengthUnitName() {
        return lengthUnitName;
    }

    public void setLengthUnitName(String lengthUnitName) {
        this.lengthUnitName = lengthUnitName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpadtedAt() {
        return upadtedAt;
    }

    public void setUpadtedAt(Date upadtedAt) {
        this.upadtedAt = upadtedAt;
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
        hash += (idlengthUnit != null ? idlengthUnit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LengthUnit)) {
            return false;
        }
        LengthUnit other = (LengthUnit) object;
        if ((this.idlengthUnit == null && other.idlengthUnit != null) || (this.idlengthUnit != null && !this.idlengthUnit.equals(other.idlengthUnit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smartify.strestservice.business.entity.LengthUnit[ idlengthUnit=" + idlengthUnit + " ]";
    }
    
}

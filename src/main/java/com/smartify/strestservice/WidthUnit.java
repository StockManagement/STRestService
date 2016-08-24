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
@Table(name = "width_unit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WidthUnit.findAll", query = "SELECT w FROM WidthUnit w"),
    @NamedQuery(name = "WidthUnit.findByIdwidthUnit", query = "SELECT w FROM WidthUnit w WHERE w.idwidthUnit = :idwidthUnit"),
    @NamedQuery(name = "WidthUnit.findByWidthUnitName", query = "SELECT w FROM WidthUnit w WHERE w.widthUnitName = :widthUnitName"),
    @NamedQuery(name = "WidthUnit.findByCreatedAt", query = "SELECT w FROM WidthUnit w WHERE w.createdAt = :createdAt"),
    @NamedQuery(name = "WidthUnit.findByUpdatedAt", query = "SELECT w FROM WidthUnit w WHERE w.updatedAt = :updatedAt")})
public class WidthUnit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idwidth_unit")
    private Integer idwidthUnit;
    @Basic(optional = false)
    @Column(name = "width_unit_name")
    private String widthUnitName;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "widthUnitId")
    private ItemSize itemSize;

    public WidthUnit() {
    }

    public WidthUnit(Integer idwidthUnit) {
        this.idwidthUnit = idwidthUnit;
    }

    public WidthUnit(Integer idwidthUnit, String widthUnitName) {
        this.idwidthUnit = idwidthUnit;
        this.widthUnitName = widthUnitName;
    }

    public Integer getIdwidthUnit() {
        return idwidthUnit;
    }

    public void setIdwidthUnit(Integer idwidthUnit) {
        this.idwidthUnit = idwidthUnit;
    }

    public String getWidthUnitName() {
        return widthUnitName;
    }

    public void setWidthUnitName(String widthUnitName) {
        this.widthUnitName = widthUnitName;
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
        hash += (idwidthUnit != null ? idwidthUnit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WidthUnit)) {
            return false;
        }
        WidthUnit other = (WidthUnit) object;
        if ((this.idwidthUnit == null && other.idwidthUnit != null) || (this.idwidthUnit != null && !this.idwidthUnit.equals(other.idwidthUnit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smartify.strestservice.WidthUnit[ idwidthUnit=" + idwidthUnit + " ]";
    }
    
}

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
@Table(name = "unit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Unit.findAll", query = "SELECT u FROM Unit u")})
public class Unit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idunit")
    private Integer idunit;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "unit_name")
    private String unitName;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "unitId")
    private OffreResult offreResult;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "unitId")
    private OffreRequirement offreRequirement;

    public Unit() {
    }

    public Unit(Integer idunit) {
        this.idunit = idunit;
    }

    public Unit(Integer idunit, String unitName) {
        this.idunit = idunit;
        this.unitName = unitName;
    }

    public Integer getIdunit() {
        return idunit;
    }

    public void setIdunit(Integer idunit) {
        this.idunit = idunit;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
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

    public OffreResult getOffreResult() {
        return offreResult;
    }

    public void setOffreResult(OffreResult offreResult) {
        this.offreResult = offreResult;
    }

    public OffreRequirement getOffreRequirement() {
        return offreRequirement;
    }

    public void setOffreRequirement(OffreRequirement offreRequirement) {
        this.offreRequirement = offreRequirement;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idunit != null ? idunit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unit)) {
            return false;
        }
        Unit other = (Unit) object;
        if ((this.idunit == null && other.idunit != null) || (this.idunit != null && !this.idunit.equals(other.idunit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smartify.strestservice.business.entity.Unit[ idunit=" + idunit + " ]";
    }
    
}

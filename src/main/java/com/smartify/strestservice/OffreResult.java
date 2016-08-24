/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartify.strestservice;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ihab BERRO
 */
@Entity
@Table(name = "offre_result")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OffreResult.findAll", query = "SELECT o FROM OffreResult o"),
    @NamedQuery(name = "OffreResult.findByIdoffreResult", query = "SELECT o FROM OffreResult o WHERE o.idoffreResult = :idoffreResult"),
    @NamedQuery(name = "OffreResult.findByOffreResultQuantity", query = "SELECT o FROM OffreResult o WHERE o.offreResultQuantity = :offreResultQuantity"),
    @NamedQuery(name = "OffreResult.findByCreatedAt", query = "SELECT o FROM OffreResult o WHERE o.createdAt = :createdAt"),
    @NamedQuery(name = "OffreResult.findByUpdatedAt", query = "SELECT o FROM OffreResult o WHERE o.updatedAt = :updatedAt")})
public class OffreResult implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idoffre_result")
    private Integer idoffreResult;
    @Column(name = "offre_result_quantity")
    private Integer offreResultQuantity;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @JoinColumn(name = "offre_id", referencedColumnName = "idoffre")
    @OneToOne(optional = false)
    private Offre offreId;
    @JoinColumn(name = "unit_id", referencedColumnName = "idunit")
    @OneToOne(optional = false)
    private Unit unitId;
    @JoinColumn(name = "item_id", referencedColumnName = "iditem")
    @OneToOne(optional = false)
    private Item itemId;

    public OffreResult() {
    }

    public OffreResult(Integer idoffreResult) {
        this.idoffreResult = idoffreResult;
    }

    public Integer getIdoffreResult() {
        return idoffreResult;
    }

    public void setIdoffreResult(Integer idoffreResult) {
        this.idoffreResult = idoffreResult;
    }

    public Integer getOffreResultQuantity() {
        return offreResultQuantity;
    }

    public void setOffreResultQuantity(Integer offreResultQuantity) {
        this.offreResultQuantity = offreResultQuantity;
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

    public Offre getOffreId() {
        return offreId;
    }

    public void setOffreId(Offre offreId) {
        this.offreId = offreId;
    }

    public Unit getUnitId() {
        return unitId;
    }

    public void setUnitId(Unit unitId) {
        this.unitId = unitId;
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
        hash += (idoffreResult != null ? idoffreResult.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OffreResult)) {
            return false;
        }
        OffreResult other = (OffreResult) object;
        if ((this.idoffreResult == null && other.idoffreResult != null) || (this.idoffreResult != null && !this.idoffreResult.equals(other.idoffreResult))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smartify.strestservice.OffreResult[ idoffreResult=" + idoffreResult + " ]";
    }
    
}

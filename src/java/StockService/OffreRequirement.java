/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockService;

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
@Table(name = "offre_requirement")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OffreRequirement.findAll", query = "SELECT o FROM OffreRequirement o"),
    @NamedQuery(name = "OffreRequirement.findByIdoffreRequirement", query = "SELECT o FROM OffreRequirement o WHERE o.idoffreRequirement = :idoffreRequirement"),
    @NamedQuery(name = "OffreRequirement.findByOffreRequirementQuantity", query = "SELECT o FROM OffreRequirement o WHERE o.offreRequirementQuantity = :offreRequirementQuantity"),
    @NamedQuery(name = "OffreRequirement.findByCreatedAt", query = "SELECT o FROM OffreRequirement o WHERE o.createdAt = :createdAt"),
    @NamedQuery(name = "OffreRequirement.findByUpdatedAt", query = "SELECT o FROM OffreRequirement o WHERE o.updatedAt = :updatedAt")})
public class OffreRequirement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idoffre_requirement")
    private Integer idoffreRequirement;
    @Column(name = "offre_requirement_quantity")
    private Integer offreRequirementQuantity;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @JoinColumn(name = "item_id", referencedColumnName = "iditem")
    @OneToOne(optional = false)
    private Item itemId;
    @JoinColumn(name = "offre_id", referencedColumnName = "idoffre")
    @OneToOne(optional = false)
    private Offre offreId;
    @JoinColumn(name = "unit_id", referencedColumnName = "idunit")
    @OneToOne(optional = false)
    private Unit unitId;

    public OffreRequirement() {
    }

    public OffreRequirement(Integer idoffreRequirement) {
        this.idoffreRequirement = idoffreRequirement;
    }

    public Integer getIdoffreRequirement() {
        return idoffreRequirement;
    }

    public void setIdoffreRequirement(Integer idoffreRequirement) {
        this.idoffreRequirement = idoffreRequirement;
    }

    public Integer getOffreRequirementQuantity() {
        return offreRequirementQuantity;
    }

    public void setOffreRequirementQuantity(Integer offreRequirementQuantity) {
        this.offreRequirementQuantity = offreRequirementQuantity;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idoffreRequirement != null ? idoffreRequirement.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OffreRequirement)) {
            return false;
        }
        OffreRequirement other = (OffreRequirement) object;
        if ((this.idoffreRequirement == null && other.idoffreRequirement != null) || (this.idoffreRequirement != null && !this.idoffreRequirement.equals(other.idoffreRequirement))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StockService.OffreRequirement[ idoffreRequirement=" + idoffreRequirement + " ]";
    }
    
}

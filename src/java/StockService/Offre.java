/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockService;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ihab BERRO
 */
@Entity
@Table(name = "offre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Offre.findAll", query = "SELECT o FROM Offre o"),
    @NamedQuery(name = "Offre.findByIdoffre", query = "SELECT o FROM Offre o WHERE o.idoffre = :idoffre"),
    @NamedQuery(name = "Offre.findByOffreCode", query = "SELECT o FROM Offre o WHERE o.offreCode = :offreCode"),
    @NamedQuery(name = "Offre.findByOffreFrom", query = "SELECT o FROM Offre o WHERE o.offreFrom = :offreFrom"),
    @NamedQuery(name = "Offre.findByOffreTo", query = "SELECT o FROM Offre o WHERE o.offreTo = :offreTo")})
public class Offre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idoffre")
    private Integer idoffre;
    @Basic(optional = false)
    @Column(name = "offre_code")
    private String offreCode;
    @Lob
    @Column(name = "offre_description")
    private String offreDescription;
    @Column(name = "offre_from")
    private String offreFrom;
    @Column(name = "offre_to")
    private String offreTo;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "offreId")
    private OffreResult offreResult;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "offreId")
    private OffreRequirement offreRequirement;

    public Offre() {
    }

    public Offre(Integer idoffre) {
        this.idoffre = idoffre;
    }

    public Offre(Integer idoffre, String offreCode) {
        this.idoffre = idoffre;
        this.offreCode = offreCode;
    }

    public Integer getIdoffre() {
        return idoffre;
    }

    public void setIdoffre(Integer idoffre) {
        this.idoffre = idoffre;
    }

    public String getOffreCode() {
        return offreCode;
    }

    public void setOffreCode(String offreCode) {
        this.offreCode = offreCode;
    }

    public String getOffreDescription() {
        return offreDescription;
    }

    public void setOffreDescription(String offreDescription) {
        this.offreDescription = offreDescription;
    }

    public String getOffreFrom() {
        return offreFrom;
    }

    public void setOffreFrom(String offreFrom) {
        this.offreFrom = offreFrom;
    }

    public String getOffreTo() {
        return offreTo;
    }

    public void setOffreTo(String offreTo) {
        this.offreTo = offreTo;
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
        hash += (idoffre != null ? idoffre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Offre)) {
            return false;
        }
        Offre other = (Offre) object;
        if ((this.idoffre == null && other.idoffre != null) || (this.idoffre != null && !this.idoffre.equals(other.idoffre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StockService.Offre[ idoffre=" + idoffre + " ]";
    }
    
}

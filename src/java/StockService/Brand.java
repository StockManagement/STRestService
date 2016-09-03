/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockService;

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
@Table(name = "brand")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Brand.findAll", query = "SELECT b FROM Brand b"),
    @NamedQuery(name = "Brand.findByIdbrand", query = "SELECT b FROM Brand b WHERE b.idbrand = :idbrand"),
    @NamedQuery(name = "Brand.findByBrandName", query = "SELECT b FROM Brand b WHERE b.brandName = :brandName"),
    @NamedQuery(name = "Brand.findByCreatedAt", query = "SELECT b FROM Brand b WHERE b.createdAt = :createdAt"),
    @NamedQuery(name = "Brand.findByUpdatedAt", query = "SELECT b FROM Brand b WHERE b.updatedAt = :updatedAt")})
public class Brand implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idbrand")
    private Integer idbrand;
    @Basic(optional = false)
    @Column(name = "brand_name")
    private String brandName;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "brandId")
    private Item item;

    public Brand() {
    }

    public Brand(Integer idbrand) {
        this.idbrand = idbrand;
    }

    public Brand(Integer idbrand, String brandName) {
        this.idbrand = idbrand;
        this.brandName = brandName;
    }

    public Integer getIdbrand() {
        return idbrand;
    }

    public void setIdbrand(Integer idbrand) {
        this.idbrand = idbrand;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
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
        hash += (idbrand != null ? idbrand.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Brand)) {
            return false;
        }
        Brand other = (Brand) object;
        if ((this.idbrand == null && other.idbrand != null) || (this.idbrand != null && !this.idbrand.equals(other.idbrand))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StockService.Brand[ idbrand=" + idbrand + " ]";
    }
    
}

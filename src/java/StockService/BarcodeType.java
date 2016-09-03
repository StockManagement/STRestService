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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ihab BERRO
 */
@Entity
@Table(name = "barcode_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BarcodeType.findAll", query = "SELECT b FROM BarcodeType b"),
    @NamedQuery(name = "BarcodeType.findByIdbarcodeType", query = "SELECT b FROM BarcodeType b WHERE b.idbarcodeType = :idbarcodeType"),
    @NamedQuery(name = "BarcodeType.findByBarcodeTypeName", query = "SELECT b FROM BarcodeType b WHERE b.barcodeTypeName = :barcodeTypeName"),
    @NamedQuery(name = "BarcodeType.findByCreatedAt", query = "SELECT b FROM BarcodeType b WHERE b.createdAt = :createdAt"),
    @NamedQuery(name = "BarcodeType.findByUpdatedAt", query = "SELECT b FROM BarcodeType b WHERE b.updatedAt = :updatedAt")})
public class BarcodeType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idbarcode_type")
    private Integer idbarcodeType;
    @Basic(optional = false)
    @Column(name = "barcode_type_name")
    private String barcodeTypeName;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    public BarcodeType() {
    }

    public BarcodeType(Integer idbarcodeType) {
        this.idbarcodeType = idbarcodeType;
    }

    public BarcodeType(Integer idbarcodeType, String barcodeTypeName) {
        this.idbarcodeType = idbarcodeType;
        this.barcodeTypeName = barcodeTypeName;
    }

    public Integer getIdbarcodeType() {
        return idbarcodeType;
    }

    public void setIdbarcodeType(Integer idbarcodeType) {
        this.idbarcodeType = idbarcodeType;
    }

    public String getBarcodeTypeName() {
        return barcodeTypeName;
    }

    public void setBarcodeTypeName(String barcodeTypeName) {
        this.barcodeTypeName = barcodeTypeName;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbarcodeType != null ? idbarcodeType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BarcodeType)) {
            return false;
        }
        BarcodeType other = (BarcodeType) object;
        if ((this.idbarcodeType == null && other.idbarcodeType != null) || (this.idbarcodeType != null && !this.idbarcodeType.equals(other.idbarcodeType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StockService.BarcodeType[ idbarcodeType=" + idbarcodeType + " ]";
    }
    
}

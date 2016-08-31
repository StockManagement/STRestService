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
@Table(name = "branch")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Branch.findAll", query = "SELECT b FROM Branch b"),
    @NamedQuery(name = "Branch.findByIdbranch", query = "SELECT b FROM Branch b WHERE b.idbranch = :idbranch"),
    @NamedQuery(name = "Branch.findByBranchName", query = "SELECT b FROM Branch b WHERE b.branchName = :branchName"),
    @NamedQuery(name = "Branch.findByCreatedAt", query = "SELECT b FROM Branch b WHERE b.createdAt = :createdAt"),
    @NamedQuery(name = "Branch.findByUpdatedAt", query = "SELECT b FROM Branch b WHERE b.updatedAt = :updatedAt")})
public class Branch implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idbranch")
    private Integer idbranch;
    @Basic(optional = false)
    @Column(name = "branch_name")
    private String branchName;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "branchId")
    private TransactionDetails transactionDetails;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "branchId")
    private Stock stock;

    public Branch() {
    }

    public Branch(Integer idbranch) {
        this.idbranch = idbranch;
    }

    public Branch(Integer idbranch, String branchName) {
        this.idbranch = idbranch;
        this.branchName = branchName;
    }

    public Integer getIdbranch() {
        return idbranch;
    }

    public void setIdbranch(Integer idbranch) {
        this.idbranch = idbranch;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
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

    public TransactionDetails getTransactionDetails() {
        return transactionDetails;
    }

    public void setTransactionDetails(TransactionDetails transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbranch != null ? idbranch.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Branch)) {
            return false;
        }
        Branch other = (Branch) object;
        if ((this.idbranch == null && other.idbranch != null) || (this.idbranch != null && !this.idbranch.equals(other.idbranch))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StockService.Branch[ idbranch=" + idbranch + " ]";
    }
    
}

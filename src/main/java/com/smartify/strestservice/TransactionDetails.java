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
@Table(name = "transaction_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TransactionDetails.findAll", query = "SELECT t FROM TransactionDetails t"),
    @NamedQuery(name = "TransactionDetails.findByIdtransactionDetails", query = "SELECT t FROM TransactionDetails t WHERE t.idtransactionDetails = :idtransactionDetails"),
    @NamedQuery(name = "TransactionDetails.findByProductionDate", query = "SELECT t FROM TransactionDetails t WHERE t.productionDate = :productionDate"),
    @NamedQuery(name = "TransactionDetails.findByExpiryDate", query = "SELECT t FROM TransactionDetails t WHERE t.expiryDate = :expiryDate"),
    @NamedQuery(name = "TransactionDetails.findByTransactionDetailsInOut", query = "SELECT t FROM TransactionDetails t WHERE t.transactionDetailsInOut = :transactionDetailsInOut"),
    @NamedQuery(name = "TransactionDetails.findByCreatedAt", query = "SELECT t FROM TransactionDetails t WHERE t.createdAt = :createdAt"),
    @NamedQuery(name = "TransactionDetails.findByUpdatedAt", query = "SELECT t FROM TransactionDetails t WHERE t.updatedAt = :updatedAt")})
public class TransactionDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtransaction_details")
    private Integer idtransactionDetails;
    @Column(name = "production_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date productionDate;
    @Column(name = "expiry_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expiryDate;
    @Column(name = "transaction_details_in_out")
    private String transactionDetailsInOut;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @JoinColumn(name = "item_id", referencedColumnName = "iditem")
    @OneToOne(optional = false)
    private Item itemId;
    @JoinColumn(name = "branch_id", referencedColumnName = "idbranch")
    @OneToOne(optional = false)
    private Branch branchId;

    public TransactionDetails() {
    }

    public TransactionDetails(Integer idtransactionDetails) {
        this.idtransactionDetails = idtransactionDetails;
    }

    public Integer getIdtransactionDetails() {
        return idtransactionDetails;
    }

    public void setIdtransactionDetails(Integer idtransactionDetails) {
        this.idtransactionDetails = idtransactionDetails;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getTransactionDetailsInOut() {
        return transactionDetailsInOut;
    }

    public void setTransactionDetailsInOut(String transactionDetailsInOut) {
        this.transactionDetailsInOut = transactionDetailsInOut;
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

    public Branch getBranchId() {
        return branchId;
    }

    public void setBranchId(Branch branchId) {
        this.branchId = branchId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtransactionDetails != null ? idtransactionDetails.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TransactionDetails)) {
            return false;
        }
        TransactionDetails other = (TransactionDetails) object;
        if ((this.idtransactionDetails == null && other.idtransactionDetails != null) || (this.idtransactionDetails != null && !this.idtransactionDetails.equals(other.idtransactionDetails))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smartify.strestservice.TransactionDetails[ idtransactionDetails=" + idtransactionDetails + " ]";
    }
    
}

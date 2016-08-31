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
import javax.persistence.Lob;
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
@Table(name = "transaction")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transaction.findAll", query = "SELECT t FROM Transaction t"),
    @NamedQuery(name = "Transaction.findByIdtransaction", query = "SELECT t FROM Transaction t WHERE t.idtransaction = :idtransaction"),
    @NamedQuery(name = "Transaction.findByTransactionNumber", query = "SELECT t FROM Transaction t WHERE t.transactionNumber = :transactionNumber"),
    @NamedQuery(name = "Transaction.findByTransactionDate", query = "SELECT t FROM Transaction t WHERE t.transactionDate = :transactionDate"),
    @NamedQuery(name = "Transaction.findByTransactionInOut", query = "SELECT t FROM Transaction t WHERE t.transactionInOut = :transactionInOut"),
    @NamedQuery(name = "Transaction.findByCreatedAt", query = "SELECT t FROM Transaction t WHERE t.createdAt = :createdAt"),
    @NamedQuery(name = "Transaction.findByUpdatedAt", query = "SELECT t FROM Transaction t WHERE t.updatedAt = :updatedAt")})
public class Transaction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtransaction")
    private Integer idtransaction;
    @Basic(optional = false)
    @Column(name = "transaction_number")
    private String transactionNumber;
    @Lob
    @Column(name = "transaction_description")
    private String transactionDescription;
    @Column(name = "transaction_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;
    @Column(name = "transaction_in_out")
    private String transactionInOut;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @JoinColumn(name = "updated_by", referencedColumnName = "iduser")
    @OneToOne(optional = false)
    private User updatedBy;
    @JoinColumn(name = "account_id", referencedColumnName = "idaccount")
    @OneToOne(optional = false)
    private Account accountId;
    @JoinColumn(name = "created_by", referencedColumnName = "iduser")
    @OneToOne(optional = false)
    private User createdBy;

    public Transaction() {
    }

    public Transaction(Integer idtransaction) {
        this.idtransaction = idtransaction;
    }

    public Transaction(Integer idtransaction, String transactionNumber) {
        this.idtransaction = idtransaction;
        this.transactionNumber = transactionNumber;
    }

    public Integer getIdtransaction() {
        return idtransaction;
    }

    public void setIdtransaction(Integer idtransaction) {
        this.idtransaction = idtransaction;
    }

    public String getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionInOut() {
        return transactionInOut;
    }

    public void setTransactionInOut(String transactionInOut) {
        this.transactionInOut = transactionInOut;
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

    public User getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(User updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Account getAccountId() {
        return accountId;
    }

    public void setAccountId(Account accountId) {
        this.accountId = accountId;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtransaction != null ? idtransaction.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaction)) {
            return false;
        }
        Transaction other = (Transaction) object;
        if ((this.idtransaction == null && other.idtransaction != null) || (this.idtransaction != null && !this.idtransaction.equals(other.idtransaction))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StockService.Transaction[ idtransaction=" + idtransaction + " ]";
    }
    
}

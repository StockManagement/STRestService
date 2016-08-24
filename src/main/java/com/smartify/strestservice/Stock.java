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
@Table(name = "stock")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stock.findAll", query = "SELECT s FROM Stock s"),
    @NamedQuery(name = "Stock.findByIdstock", query = "SELECT s FROM Stock s WHERE s.idstock = :idstock"),
    @NamedQuery(name = "Stock.findByStockMinPrice", query = "SELECT s FROM Stock s WHERE s.stockMinPrice = :stockMinPrice"),
    @NamedQuery(name = "Stock.findByStockMaxPrice", query = "SELECT s FROM Stock s WHERE s.stockMaxPrice = :stockMaxPrice"),
    @NamedQuery(name = "Stock.findByStockUnitCost", query = "SELECT s FROM Stock s WHERE s.stockUnitCost = :stockUnitCost"),
    @NamedQuery(name = "Stock.findByStockAverageUnitCost", query = "SELECT s FROM Stock s WHERE s.stockAverageUnitCost = :stockAverageUnitCost"),
    @NamedQuery(name = "Stock.findByCreatedAt", query = "SELECT s FROM Stock s WHERE s.createdAt = :createdAt"),
    @NamedQuery(name = "Stock.findByUpdatedAt", query = "SELECT s FROM Stock s WHERE s.updatedAt = :updatedAt")})
public class Stock implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idstock")
    private Integer idstock;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "stock_min_price")
    private Float stockMinPrice;
    @Column(name = "stock_max_price")
    private Float stockMaxPrice;
    @Column(name = "stock_unit_cost")
    private Float stockUnitCost;
    @Column(name = "stock_average_unit_cost")
    private Float stockAverageUnitCost;
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

    public Stock() {
    }

    public Stock(Integer idstock) {
        this.idstock = idstock;
    }

    public Integer getIdstock() {
        return idstock;
    }

    public void setIdstock(Integer idstock) {
        this.idstock = idstock;
    }

    public Float getStockMinPrice() {
        return stockMinPrice;
    }

    public void setStockMinPrice(Float stockMinPrice) {
        this.stockMinPrice = stockMinPrice;
    }

    public Float getStockMaxPrice() {
        return stockMaxPrice;
    }

    public void setStockMaxPrice(Float stockMaxPrice) {
        this.stockMaxPrice = stockMaxPrice;
    }

    public Float getStockUnitCost() {
        return stockUnitCost;
    }

    public void setStockUnitCost(Float stockUnitCost) {
        this.stockUnitCost = stockUnitCost;
    }

    public Float getStockAverageUnitCost() {
        return stockAverageUnitCost;
    }

    public void setStockAverageUnitCost(Float stockAverageUnitCost) {
        this.stockAverageUnitCost = stockAverageUnitCost;
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
        hash += (idstock != null ? idstock.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stock)) {
            return false;
        }
        Stock other = (Stock) object;
        if ((this.idstock == null && other.idstock != null) || (this.idstock != null && !this.idstock.equals(other.idstock))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smartify.strestservice.Stock[ idstock=" + idstock + " ]";
    }
    
}

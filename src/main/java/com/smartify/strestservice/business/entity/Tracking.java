/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartify.strestservice.business.entity;

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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ajaafar
 */
@Entity
@Table(name = "tracking")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tracking.findAll", query = "SELECT t FROM Tracking t"),
    @NamedQuery(name = "Tracking.findByIdtracking", query = "SELECT t FROM Tracking t WHERE t.idtracking = :idtracking"),
    @NamedQuery(name = "Tracking.findByLatitude", query = "SELECT t FROM Tracking t WHERE t.latitude = :latitude"),
    @NamedQuery(name = "Tracking.findByLogitude", query = "SELECT t FROM Tracking t WHERE t.logitude = :logitude"),
    @NamedQuery(name = "Tracking.findByAccuracy", query = "SELECT t FROM Tracking t WHERE t.accuracy = :accuracy"),
    @NamedQuery(name = "Tracking.findByLocationProvicer", query = "SELECT t FROM Tracking t WHERE t.locationProvicer = :locationProvicer"),
    @NamedQuery(name = "Tracking.findByProvider", query = "SELECT t FROM Tracking t WHERE t.provider = :provider"),
    @NamedQuery(name = "Tracking.findByDateTime", query = "SELECT t FROM Tracking t WHERE t.dateTime = :dateTime"),
    @NamedQuery(name = "Tracking.findBySpeed", query = "SELECT t FROM Tracking t WHERE t.speed = :speed"),
    @NamedQuery(name = "Tracking.findByUserId", query = "SELECT t FROM Tracking t WHERE t.userId = :userId"),
    @NamedQuery(name = "Tracking.findByCreatedDate", query = "SELECT t FROM Tracking t WHERE t.createdDate = :createdDate")})
public class Tracking implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtracking")
    private Integer idtracking;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "latitude")
    private Double latitude;
    @Column(name = "logitude")
    private Double logitude;
    @Column(name = "accuracy")
    private Double accuracy;
    @Column(name = "locationProvicer")
    private Integer locationProvicer;
    @Size(max = 255)
    @Column(name = "provider")
    private String provider;
    @Column(name = "date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTime;
    @Column(name = "speed")
    private Double speed;
    @Column(name = "userId")
    private Integer userId;
    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    public Tracking() {
    }

    public Tracking(Integer idtracking) {
        this.idtracking = idtracking;
    }

    public Integer getIdtracking() {
        return idtracking;
    }

    public void setIdtracking(Integer idtracking) {
        this.idtracking = idtracking;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLogitude() {
        return logitude;
    }

    public void setLogitude(Double logitude) {
        this.logitude = logitude;
    }

    public Double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Double accuracy) {
        this.accuracy = accuracy;
    }

    public Integer getLocationProvicer() {
        return locationProvicer;
    }

    public void setLocationProvicer(Integer locationProvicer) {
        this.locationProvicer = locationProvicer;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtracking != null ? idtracking.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tracking)) {
            return false;
        }
        Tracking other = (Tracking) object;
        if ((this.idtracking == null && other.idtracking != null) || (this.idtracking != null && !this.idtracking.equals(other.idtracking))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smartify.strestservice.business.entity.Tracking[ idtracking=" + idtracking + " ]";
    }
    
}

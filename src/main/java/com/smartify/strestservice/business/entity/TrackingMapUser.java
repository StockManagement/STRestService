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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tracking_map_user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TrackingMapUser.findAll", query = "SELECT t FROM TrackingMapUser t"),
    @NamedQuery(name = "TrackingMapUser.findById", query = "SELECT t FROM TrackingMapUser t WHERE t.id = :id"),
    @NamedQuery(name = "TrackingMapUser.findByDateTime", query = "SELECT t FROM TrackingMapUser t WHERE t.dateTime = :dateTime"),
    @NamedQuery(name = "TrackingMapUser.findByLat", query = "SELECT t FROM TrackingMapUser t WHERE t.lat = :lat"),
    @NamedQuery(name = "TrackingMapUser.findByLong1", query = "SELECT t FROM TrackingMapUser t WHERE t.long1 = :long1"),
    @NamedQuery(name = "TrackingMapUser.findByCreatedDate", query = "SELECT t FROM TrackingMapUser t WHERE t.createdDate = :createdDate")})
public class TrackingMapUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTime;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "lat")
    private Double lat;
    @Column(name = "long")
    private Double long1;
    @Size(max = 45)
    @Column(name = "created_date")
    private String createdDate;
    @JoinColumn(name = "user_id", referencedColumnName = "iduser")
    @ManyToOne
    private User userId;

    public TrackingMapUser() {
    }

    public TrackingMapUser(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLong1() {
        return long1;
    }

    public void setLong1(Double long1) {
        this.long1 = long1;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrackingMapUser)) {
            return false;
        }
        TrackingMapUser other = (TrackingMapUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smartify.strestservice.business.entity.TrackingMapUser[ id=" + id + " ]";
    }
    
}

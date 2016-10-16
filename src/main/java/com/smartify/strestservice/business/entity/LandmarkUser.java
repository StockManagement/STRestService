/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartify.strestservice.business.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ajaafar
 */
@Entity
@Table(name = "landmark_user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LandmarkUser.findAll", query = "SELECT l FROM LandmarkUser l"),
    @NamedQuery(name = "LandmarkUser.findByIdlandmarkUser", query = "SELECT l FROM LandmarkUser l WHERE l.idlandmarkUser = :idlandmarkUser"),
    @NamedQuery(name = "LandmarkUser.findByLandmarkId", query = "SELECT l FROM LandmarkUser l WHERE l.landmarkId = :landmarkId"),
    @NamedQuery(name = "LandmarkUser.findByUserId", query = "SELECT l FROM LandmarkUser l WHERE l.userId = :userId")})
public class LandmarkUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idlandmark_user")
    private Integer idlandmarkUser;
    @Column(name = "landmark_id")
    private Integer landmarkId;
    @Column(name = "user_id")
    private Integer userId;

    public LandmarkUser() {
    }

    public LandmarkUser(Integer idlandmarkUser) {
        this.idlandmarkUser = idlandmarkUser;
    }

    public Integer getIdlandmarkUser() {
        return idlandmarkUser;
    }

    public void setIdlandmarkUser(Integer idlandmarkUser) {
        this.idlandmarkUser = idlandmarkUser;
    }

    public Integer getLandmarkId() {
        return landmarkId;
    }

    public void setLandmarkId(Integer landmarkId) {
        this.landmarkId = landmarkId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlandmarkUser != null ? idlandmarkUser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LandmarkUser)) {
            return false;
        }
        LandmarkUser other = (LandmarkUser) object;
        if ((this.idlandmarkUser == null && other.idlandmarkUser != null) || (this.idlandmarkUser != null && !this.idlandmarkUser.equals(other.idlandmarkUser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smartify.strestservice.business.entity.LandmarkUser[ idlandmarkUser=" + idlandmarkUser + " ]";
    }
    
}

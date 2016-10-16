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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ajaafar
 */
@Entity
@Table(name = "view_user_tracking")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ViewUserTracking.findAll", query = "SELECT v FROM ViewUserTracking v"),
    @NamedQuery(name = "ViewUserTracking.findByIdtracking", query = "SELECT v FROM ViewUserTracking v WHERE v.idtracking = :idtracking"),
    @NamedQuery(name = "ViewUserTracking.findByIduser", query = "SELECT v FROM ViewUserTracking v WHERE v.iduser = :iduser"),
    @NamedQuery(name = "ViewUserTracking.findByUserName", query = "SELECT v FROM ViewUserTracking v WHERE v.userName = :userName"),
    @NamedQuery(name = "ViewUserTracking.findByPhoneNumber", query = "SELECT v FROM ViewUserTracking v WHERE v.phoneNumber = :phoneNumber"),
    @NamedQuery(name = "ViewUserTracking.findByTrackColor", query = "SELECT v FROM ViewUserTracking v WHERE v.trackColor = :trackColor"),
    @NamedQuery(name = "ViewUserTracking.findByLatitude", query = "SELECT v FROM ViewUserTracking v WHERE v.latitude = :latitude"),
    @NamedQuery(name = "ViewUserTracking.findByLogitude", query = "SELECT v FROM ViewUserTracking v WHERE v.logitude = :logitude")})
public class ViewUserTracking implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtracking")
    private int idtracking;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iduser")
    private int iduser;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "user_name")
    private String userName;
    @Size(max = 45)
    @Column(name = "phone_number")
    private String phoneNumber;
    @Size(max = 45)
    @Column(name = "track_color")
    private String trackColor;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "latitude")
    private Double latitude;
    @Column(name = "logitude")
    private Double logitude;

    public ViewUserTracking() {
    }

    public int getIdtracking() {
        return idtracking;
    }

    public void setIdtracking(int idtracking) {
        this.idtracking = idtracking;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTrackColor() {
        return trackColor;
    }

    public void setTrackColor(String trackColor) {
        this.trackColor = trackColor;
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
    
}

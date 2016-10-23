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
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ajaafar
 */
@Entity
@Table(name = "view_user_locations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ViewUserLocations.findAll", query = "SELECT v FROM ViewUserLocations v"),
    @NamedQuery(name = "ViewUserLocations.findByIduser", query = "SELECT v FROM ViewUserLocations v WHERE v.iduser = :iduser"),
    @NamedQuery(name = "ViewUserLocations.findByUserName", query = "SELECT v FROM ViewUserLocations v WHERE v.userName = :userName"),
    @NamedQuery(name = "ViewUserLocations.findByCreatedAt", query = "SELECT v FROM ViewUserLocations v WHERE v.createdAt = :createdAt"),
    @NamedQuery(name = "ViewUserLocations.findByUpdatedAt", query = "SELECT v FROM ViewUserLocations v WHERE v.updatedAt = :updatedAt"),
    @NamedQuery(name = "ViewUserLocations.findByPhoneNumber", query = "SELECT v FROM ViewUserLocations v WHERE v.phoneNumber = :phoneNumber"),
    @NamedQuery(name = "ViewUserLocations.findByUserTypeId", query = "SELECT v FROM ViewUserLocations v WHERE v.userTypeId = :userTypeId"),
    @NamedQuery(name = "ViewUserLocations.findByIdlandmark", query = "SELECT v FROM ViewUserLocations v WHERE v.idlandmark = :idlandmark"),
    @NamedQuery(name = "ViewUserLocations.findByTypeId", query = "SELECT v FROM ViewUserLocations v WHERE v.typeId = :typeId"),
    @NamedQuery(name = "ViewUserLocations.findByName", query = "SELECT v FROM ViewUserLocations v WHERE v.name = :name"),
    @NamedQuery(name = "ViewUserLocations.findByX", query = "SELECT v FROM ViewUserLocations v WHERE v.x = :x"),
    @NamedQuery(name = "ViewUserLocations.findByY", query = "SELECT v FROM ViewUserLocations v WHERE v.y = :y"),
    @NamedQuery(name = "ViewUserLocations.findByUserId", query = "SELECT v FROM ViewUserLocations v WHERE v.userId = :userId"),
    @NamedQuery(name = "ViewUserLocations.findByImg", query = "SELECT v FROM ViewUserLocations v WHERE v.img = :img"),
    @NamedQuery(name = "ViewUserLocations.findByIduserIdlandmark", query = "SELECT v FROM ViewUserLocations v WHERE v.iduserIdlandmark = :iduserIdlandmark")})
public class ViewUserLocations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iduser")
    private int iduser;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "user_name")
    private String userName;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Size(max = 45)
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "user_type_id")
    private Integer userTypeId;
    @Column(name = "idlandmark")
    private Integer idlandmark;
    @Lob
    @Size(max = 65535)
    @Column(name = "tag")
    private String tag;
    @Column(name = "type_id")
    private Integer typeId;
    @Size(max = 255)
    @Column(name = "name")
    private String name;
    @Lob
    @Size(max = 65535)
    @Column(name = "description")
    private String description;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "x")
    private Double x;
    @Column(name = "y")
    private Double y;
    @Column(name = "user_id")
    private Integer userId;
    @Lob
    @Size(max = 65535)
    @Column(name = "style")
    private String style;
    @Size(max = 255)
    @Column(name = "img")
    private String img;
    @Size(max = 11)

    @Column(name = "iduser_idlandmark")
    @Id
    private String iduserIdlandmark;

    public ViewUserLocations() {
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    public Integer getIdlandmark() {
        return idlandmark;
    }

    public void setIdlandmark(Integer idlandmark) {
        this.idlandmark = idlandmark;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getIduserIdlandmark() {
        return iduserIdlandmark;
    }

    public void setIduserIdlandmark(String iduserIdlandmark) {
        this.iduserIdlandmark = iduserIdlandmark;
    }

}

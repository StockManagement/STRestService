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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "landmark")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Landmark.findAll", query = "SELECT l FROM Landmark l"),
    @NamedQuery(name = "Landmark.findByIdlandmark", query = "SELECT l FROM Landmark l WHERE l.idlandmark = :idlandmark"),
    @NamedQuery(name = "Landmark.findByTypeId", query = "SELECT l FROM Landmark l WHERE l.typeId = :typeId"),
    @NamedQuery(name = "Landmark.findByName", query = "SELECT l FROM Landmark l WHERE l.name = :name"),
    @NamedQuery(name = "Landmark.findByX", query = "SELECT l FROM Landmark l WHERE l.x = :x"),
    @NamedQuery(name = "Landmark.findByY", query = "SELECT l FROM Landmark l WHERE l.y = :y"),
    @NamedQuery(name = "Landmark.findByImg", query = "SELECT l FROM Landmark l WHERE l.img = :img")})
public class Landmark implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "x")
    private double x;
    @Basic(optional = false)
    @NotNull
    @Column(name = "y")
    private double y;
    @Lob
    @Size(max = 65535)
    @Column(name = "style")
    private String style;
    @Size(max = 255)
    @Column(name = "img")
    private String img;
    @JoinColumn(name = "user_id", referencedColumnName = "iduser")
    @ManyToOne
    private User userId;

    public Landmark() {
    }

    public Landmark(Integer idlandmark) {
        this.idlandmark = idlandmark;
    }

    public Landmark(Integer idlandmark, double x, double y) {
        this.idlandmark = idlandmark;
        this.x = x;
        this.y = y;
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

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
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

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlandmark != null ? idlandmark.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Landmark)) {
            return false;
        }
        Landmark other = (Landmark) object;
        if ((this.idlandmark == null && other.idlandmark != null) || (this.idlandmark != null && !this.idlandmark.equals(other.idlandmark))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smartify.strestservice.business.entity.Landmark[ idlandmark=" + idlandmark + " ]";
    }
    
}

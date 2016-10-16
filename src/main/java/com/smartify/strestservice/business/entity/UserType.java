/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartify.strestservice.business.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ajaafar
 */
@Entity
@Table(name = "user_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserType.findAll", query = "SELECT u FROM UserType u"),
    @NamedQuery(name = "UserType.findByIduserType", query = "SELECT u FROM UserType u WHERE u.iduserType = :iduserType"),
    @NamedQuery(name = "UserType.findByUserTypeName", query = "SELECT u FROM UserType u WHERE u.userTypeName = :userTypeName")})
public class UserType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iduser_type")
    private Integer iduserType;
    @Size(max = 45)
    @Column(name = "user_type_name")
    private String userTypeName;
    @OneToMany(mappedBy = "userTypeId")
    private Collection<User> userCollection;

    public UserType() {
    }

    public UserType(Integer iduserType) {
        this.iduserType = iduserType;
    }

    public Integer getIduserType() {
        return iduserType;
    }

    public void setIduserType(Integer iduserType) {
        this.iduserType = iduserType;
    }

    public String getUserTypeName() {
        return userTypeName;
    }

    public void setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName;
    }

    @XmlTransient
    public Collection<User> getUserCollection() {
        return userCollection;
    }

    public void setUserCollection(Collection<User> userCollection) {
        this.userCollection = userCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iduserType != null ? iduserType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserType)) {
            return false;
        }
        UserType other = (UserType) object;
        if ((this.iduserType == null && other.iduserType != null) || (this.iduserType != null && !this.iduserType.equals(other.iduserType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.smartify.strestservice.business.entity.UserType[ iduserType=" + iduserType + " ]";
    }
    
}

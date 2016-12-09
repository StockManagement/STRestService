package com.smartify.strestservice.rest;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.gson.Gson;
import com.smartify.strestservice.business.entity.Landmark;
import com.smartify.strestservice.business.entity.Tracking;
import com.smartify.strestservice.business.entity.User;
import com.smartify.strestservice.business.entity.UserType;
import com.smartify.strestservice.business.entity.User_;
import com.smartify.strestservice.business.entity.ViewUserLocations;
import com.smartify.strestservice.business.entity.ViewUserTracking;
import com.smartify.strestservice.business.entity.ViewUserTracking_;
import com.smartify.strestservice.listener.stRestServiceEntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import org.omg.PortableServer.IdAssignmentPolicyValue;

/**
 *
 * @author housseinmonzer
 */
@Stateless
@Path("/userlocationcustom")
public class UserLocationCustomFacadeREST {

    protected EntityManager em;
    protected EntityManagerFactory emf;

    @XmlRootElement
    class Login implements Serializable {

        private static final long serialVersionUID = 1L;
        public String username;
        public String password;
    }

    public UserLocationCustomFacadeREST() {
        this.em = stRestServiceEntityManagerFactory.getEntityManager();
        this.emf = stRestServiceEntityManagerFactory.getEntityManagerFactory();
    }

    protected EntityManager getEntityManager() {
        if (!em.isOpen()) {
            this.em = emf.createEntityManager();
        }
        return this.em;
    }

    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(ViewUserLocations entity) {
        UserTypeFacadeREST UserTypeFacade = new UserTypeFacadeREST();
        UserType usertype = UserTypeFacade.find(2);

        User user = new User();
        user.setUserName(entity.getUserName());
        user.setDescription(entity.getDescription());
        user.setPhoneNumber(entity.getPhoneNumber());
        user.setCreatedAt(new Date());
        user.setUpdatedAt(new Date());
        user.setUserTypeId(usertype);

        em.getTransaction().begin();
        getEntityManager().persist(user);
        em.getTransaction().commit();

        if (entity.getX() != null && entity.getY() != null) {
            Landmark landmark = new Landmark();
            landmark.setX(entity.getX());
            landmark.setY(entity.getY());
            landmark.setImg(entity.getImg());
            landmark.setUserId(user);

            em.getTransaction().begin();
            getEntityManager().persist(landmark);
            em.getTransaction().commit();
        }
    }

    @POST
    @Path("getuserbyphonenumber")
    @Consumes({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public User getUserByPhoneNumber(String phoneNumber) {

        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<User> criteriaQuery = criteriaBuilder.createQuery(User.class);
        javax.persistence.criteria.Root<User> user = criteriaQuery.from(User.class);
        Predicate condition = criteriaBuilder.equal(user.get(User_.phoneNumber), phoneNumber);
        criteriaQuery.where(condition);
        TypedQuery<User> query = getEntityManager().createQuery(criteriaQuery);
        List<User> users = query.getResultList();
        if (users != null && users.size() > 0) {
            return users.get(0);
        }
        return null;
    }

    @POST
    @Path("/login")
    @Consumes({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public User login(String loginStr) {
        try {
            // TODO: add password to login entity
            Gson gson = new Gson();
            Login loginObj = gson.fromJson(loginStr, Login.class);
            if (loginObj != null) {
                TypedQuery<User> query = em.createNamedQuery("User.findByUserName", User.class).setParameter("userName",
                        loginObj.username);
                List<User> users = query.getResultList();
                if (users != null && users.size() > 0) {
                    return users.get(0);
                }
            }
        } catch (Exception e) {
        }
        return null;
    }

    @POST
    @Path("/track")
    @Consumes({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON})
    public void create(Tracking track) {
        em.getTransaction().begin();
        getEntityManager().persist(track);
        em.getTransaction().commit();

    }

    @GET
    @Path("/test")
    public String test() {
        return "it's working";
    }
}

package com.smartify.strestservice.rest;

import java.util.Date;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.smartify.strestservice.business.entity.Landmark;
import com.smartify.strestservice.business.entity.User;
import com.smartify.strestservice.business.entity.ViewUserLocations;
import com.smartify.strestservice.listener.stRestServiceEntityManagerFactory;

/**
 *
 * @author housseinmonzer
 */

@Stateless
@Path("/userlocationcustom")
public class UserLocationCustomFacadeREST {
	protected EntityManager em;
	protected EntityManagerFactory emf;

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
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public void create(ViewUserLocations entity) {
		User user = new User();
		user.setUserName(entity.getUserName());
		user.setDescription(entity.getDescription());
		user.setPhoneNumber(entity.getPhoneNumber());
		user.setCreatedAt(new Date());
		user.setUpdatedAt(new Date());

		em.getTransaction().begin();
		getEntityManager().persist(user);
		em.getTransaction().commit();
		
		if(entity.getX()!= null && entity.getY()!=null){
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
}

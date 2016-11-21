/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartify.strestservice.rest;

import com.smartify.strestservice.business.entity.ViewUserLocations;
import com.smartify.strestservice.business.entity.ViewUserTracking;
import com.smartify.strestservice.model.UserTrackingModel;
import java.sql.Timestamp;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author ajaafar
 */
@Stateless
@Path("/usertracking")
public class UserTrackingFacadeREST extends AbstractFacade<ViewUserTracking> {

   
    public UserTrackingFacadeREST() {
        super(ViewUserTracking.class);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<ViewUserTracking> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<ViewUserTracking> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }
//int userId,Timestamp from,Timestamp to
    @GET
    @Path("/getUserTrackBy/userId={userId}/from={from}/to={to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<ViewUserTracking> getUserTrackBy(@PathParam("userId") Integer userId, @PathParam("from") String from, @PathParam("to") String to) {
        return  new UserTrackingModel().getUserTrackBy(userId,from,to);
    }
    
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}

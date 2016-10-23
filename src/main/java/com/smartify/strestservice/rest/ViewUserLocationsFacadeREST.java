/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartify.strestservice.rest;

import com.smartify.strestservice.business.entity.User;
import com.smartify.strestservice.business.entity.ViewUserLocations;
import com.smartify.strestservice.model.UserlocationModel;

import java.time.LocalDateTime;
import java.util.Date;
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
 * @author housseinmonzer
 */
@Stateless
@Path("/userlocations")
public class ViewUserLocationsFacadeREST extends AbstractFacade<ViewUserLocations> {

    public ViewUserLocationsFacadeREST() {
        super(ViewUserLocations.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(ViewUserLocations entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") String id, ViewUserLocations entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") String id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public ViewUserLocations find(@PathParam("id") String id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<ViewUserLocations> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<ViewUserLocations> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }
//findByUserType(int user_type_id,int[] range)
    @GET
    @Path("/findByUserType/type={user_type_id}/from={from}/to={to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<ViewUserLocations> findByUserType(@PathParam("user_type_id") Integer user_type_id,@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return  new UserlocationModel().findByUserType(user_type_id,new int[]{from, to});
    }
        @Override
        protected EntityManager getEntityManager
        
            () {
        return em;
        }

    
}
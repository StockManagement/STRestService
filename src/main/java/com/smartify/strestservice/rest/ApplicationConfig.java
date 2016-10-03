/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartify.strestservice.rest;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author ajaafar
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.smartify.strestservice.listener.CORSFilter.class);
        resources.add(com.smartify.strestservice.rest.AccountFacadeREST.class);
        resources.add(com.smartify.strestservice.rest.AreaFacadeREST.class);
        resources.add(com.smartify.strestservice.rest.BarcodeTypeFacadeREST.class);
        resources.add(com.smartify.strestservice.rest.BranchFacadeREST.class);
        resources.add(com.smartify.strestservice.rest.BrandFacadeREST.class);
        resources.add(com.smartify.strestservice.rest.CategoryFacadeREST.class);
        resources.add(com.smartify.strestservice.rest.CountryFacadeREST.class);
        resources.add(com.smartify.strestservice.rest.HeightUnitFacadeREST.class);
        resources.add(com.smartify.strestservice.rest.HelloWorldService.class);
        resources.add(com.smartify.strestservice.rest.ItemFacadeREST.class);
        resources.add(com.smartify.strestservice.rest.ItemSizeFacadeREST.class);
        resources.add(com.smartify.strestservice.rest.ItemTypeFacadeREST.class);
         resources.add(com.smartify.strestservice.rest.LandmarkFacadeREST.class);
        resources.add(com.smartify.strestservice.rest.LengthUnitFacadeREST.class);
        resources.add(com.smartify.strestservice.rest.OffreFacadeREST.class);
        resources.add(com.smartify.strestservice.rest.OffreRequirementFacadeREST.class);
        resources.add(com.smartify.strestservice.rest.OffreResultFacadeREST.class);
        resources.add(com.smartify.strestservice.rest.PackageFacadeREST.class);
        resources.add(com.smartify.strestservice.rest.StockFacadeREST.class);
        resources.add(com.smartify.strestservice.rest.TransactionDetailsFacadeREST.class);
        resources.add(com.smartify.strestservice.rest.TransactionFacadeREST.class);
        resources.add(com.smartify.strestservice.rest.UnitFacadeREST.class);
        resources.add(com.smartify.strestservice.rest.UserFacadeREST.class);
        resources.add(com.smartify.strestservice.rest.UserLocationCustomFacadeREST.class);
        resources.add(com.smartify.strestservice.rest.ViewUserLocationsFacadeREST.class);
        resources.add(com.smartify.strestservice.rest.WeightUnitFacadeREST.class);
        resources.add(com.smartify.strestservice.rest.WidthUnitFacadeREST.class);
        resources.add(org.glassfish.jersey.server.wadl.internal.WadlResource.class);
    }
    
}

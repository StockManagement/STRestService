/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockService.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Ihab BERRO
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
        resources.add(StockService.service.AccountFacadeREST.class);
        resources.add(StockService.service.AreaFacadeREST.class);
        resources.add(StockService.service.BarcodeTypeFacadeREST.class);
        resources.add(StockService.service.BranchFacadeREST.class);
        resources.add(StockService.service.BrandFacadeREST.class);
        resources.add(StockService.service.CategoryFacadeREST.class);
        resources.add(StockService.service.CountryFacadeREST.class);
        resources.add(StockService.service.HeightUnitFacadeREST.class);
        resources.add(StockService.service.ItemFacadeREST.class);
        resources.add(StockService.service.ItemSizeFacadeREST.class);
        resources.add(StockService.service.ItemTypeFacadeREST.class);
        resources.add(StockService.service.LengthUnitFacadeREST.class);
        resources.add(StockService.service.OffreFacadeREST.class);
        resources.add(StockService.service.OffreRequirementFacadeREST.class);
        resources.add(StockService.service.OffreResultFacadeREST.class);
        resources.add(StockService.service.PackageFacadeREST.class);
        resources.add(StockService.service.StockFacadeREST.class);
        resources.add(StockService.service.TransactionDetailsFacadeREST.class);
        resources.add(StockService.service.TransactionFacadeREST.class);
        resources.add(StockService.service.UnitFacadeREST.class);
        resources.add(StockService.service.UserFacadeREST.class);
        resources.add(StockService.service.WeightUnitFacadeREST.class);
        resources.add(StockService.service.WidthUnitFacadeREST.class);
    }
    
}

package com.smartify.strestservice.listener;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


/**
 *
 * @author  ajaafar
 */
@WebListener
public class stRestServiceEntityManagerFactory implements ServletContextListener
{
    private static EntityManagerFactory emf;

    @Override
    public void contextInitialized(ServletContextEvent sce) 
    {
        emf = Persistence.createEntityManagerFactory("com.smartify_stRestService_war_1.0-SNAPSHOTPU");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) 
    {
        emf.close();
    }
    
    public static EntityManager getEntityManager()
    {
        if (null == emf) {
            throw new IllegalStateException("Context needs to be intialized first");
        }
        
        return emf.createEntityManager();
    }

    public static EntityManagerFactory getEntityManagerFactory(){
        return emf;
    }

    
}

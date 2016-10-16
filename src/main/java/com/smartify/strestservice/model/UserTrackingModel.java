/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartify.strestservice.model;

import com.smartify.strestservice.business.entity.ViewUserTracking;
import com.smartify.strestservice.business.entity.ViewUserTracking_;
import com.smartify.strestservice.rest.AbstractFacade;
import java.sql.Timestamp;
import java.util.List;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;

/**
 *
 * @author ajaafar
 */
public class UserTrackingModel extends AbstractFacade<ViewUserTracking> {

    public UserTrackingModel() {
        super(ViewUserTracking.class);
    }

    public List<ViewUserTracking> getUserTrackBy(int userId,Timestamp from,Timestamp to) {
        try {
            CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
            CriteriaQuery<ViewUserTracking> criteriaQuery = criteriaBuilder.createQuery(ViewUserTracking.class);
            javax.persistence.criteria.Root<ViewUserTracking> vuserTracking = criteriaQuery.from(ViewUserTracking.class);
            Predicate condition = criteriaBuilder.equal(vuserTracking.get(ViewUserTracking_.iduser), userId);
            criteriaQuery.where(condition);
            TypedQuery<ViewUserTracking> query = getEntityManager().createQuery(criteriaQuery);
            
            List<ViewUserTracking> list = query.getResultList();
            if (list == null || list.isEmpty()) {
                return null;
            }

            return list;

        } catch (Exception ex) {

          //1  ex.printStackTrace();
            return null;
        } finally {
            getEntityManager().close();
        }
    }
}

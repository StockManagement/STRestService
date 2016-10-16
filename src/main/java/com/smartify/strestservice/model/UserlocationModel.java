/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartify.strestservice.model;

import com.smartify.strestservice.business.entity.ViewUserLocations;
import com.smartify.strestservice.business.entity.ViewUserLocations_;
import com.smartify.strestservice.rest.AbstractFacade;
import java.util.List;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;

/**
 *
 * @author ajaafar
 */
public class UserlocationModel extends AbstractFacade<ViewUserLocations> {

    public UserlocationModel() {
        super(ViewUserLocations.class);
    }

    public List<ViewUserLocations> findByUserType(int user_type_id,int[] range) {
        try {
            CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
            CriteriaQuery<ViewUserLocations> criteriaQuery = criteriaBuilder.createQuery(ViewUserLocations.class);
            javax.persistence.criteria.Root<ViewUserLocations> vuserlocation = criteriaQuery.from(ViewUserLocations.class);
            Predicate condition = criteriaBuilder.equal(vuserlocation.get(ViewUserLocations_.userTypeId), user_type_id);
            criteriaQuery.where(condition);
            TypedQuery<ViewUserLocations> query = getEntityManager().createQuery(criteriaQuery);
            query.setMaxResults(range[1] - range[0] + 1);
             query.setFirstResult(range[0]);
            List<ViewUserLocations> list = query.getResultList();
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_v5;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.entity.FailedJobs;

/**
 *
 * @author maria
 */
@Stateless
public class FailedJobsFacade extends AbstractFacade<FailedJobs> {

    @PersistenceContext(unitName = "Bai_v5PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FailedJobsFacade() {
        super(FailedJobs.class);
    }
    
}

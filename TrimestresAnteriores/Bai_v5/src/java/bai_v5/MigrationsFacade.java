/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_v5;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.entity.Migrations;

/**
 *
 * @author maria
 */
@Stateless
public class MigrationsFacade extends AbstractFacade<Migrations> {

    @PersistenceContext(unitName = "Bai_v5PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MigrationsFacade() {
        super(Migrations.class);
    }
    
}

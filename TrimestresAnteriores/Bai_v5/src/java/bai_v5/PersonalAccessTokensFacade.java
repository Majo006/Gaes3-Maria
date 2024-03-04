/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_v5;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.entity.PersonalAccessTokens;

/**
 *
 * @author maria
 */
@Stateless
public class PersonalAccessTokensFacade extends AbstractFacade<PersonalAccessTokens> {

    @PersistenceContext(unitName = "Bai_v5PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonalAccessTokensFacade() {
        super(PersonalAccessTokens.class);
    }
    
}

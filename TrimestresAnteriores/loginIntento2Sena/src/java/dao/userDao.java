/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Cuentas;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Aprendiz
 */
public class userDao {
    private EntityManagerFactory emf;

    public userDao(EntityManagerFactory emf) {
        this.emf = Persistence.createEntityManagerFactory(loginIntento2SenaPU);
    }
    
   public Cuentas validarUsuario()
   {
       User user;
       EntityManager em= emf.createEntityManager();
       
       String sql="";
       return user;
   }
    
}

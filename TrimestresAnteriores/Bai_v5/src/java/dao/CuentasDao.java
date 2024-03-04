/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Cuentas;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CuentasDao {
    private final EntityManagerFactory emf;

    public CuentasDao() {
        this.emf = Persistence.createEntityManagerFactory("Bai_v5PU");
    }
    
    public Cuentas validarCuenta(String email, String contraseña) {
        EntityManager em = emf.createEntityManager();
        
        try {
            String sql = "SELECT c FROM Cuentas c WHERE c.email = :email AND c.contraseña = :contraseña";
            Query query = em.createQuery(sql);
            query.setParameter("email", email);
            query.setParameter("contraseña", contraseña);
            
            List<Cuentas> results = query.getResultList();
            if (results != null && !results.isEmpty()) {
                return results.get(0);
            } else {
                FacesMessage message = new FacesMessage("Usuario no registrado");
                FacesContext.getCurrentInstance().addMessage(null, message);
                return null;
            }
        } catch (Exception e) {
            throw new RuntimeException("Error al validar el usuario.", e);
        }
 
}
}

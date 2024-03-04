/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import jpa.entities.Cuentas;

/**
 *
 * @author maria
 */
@Stateless
public class CuentasFacade extends AbstractFacade<Cuentas> {

    @PersistenceContext(unitName = "Bai_v6PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CuentasFacade() {
        super(Cuentas.class);
    }
 
     public Cuentas validarUsuario(String correoElectronico, String contraseñaUsuario) {
        try {
            Query query = em.createQuery("SELECT c FROM Cuentas c WHERE c.email = :correoElectronico AND c.contraseña = :contraseñaUsuario");
            query.setParameter("correoElectronico", correoElectronico);
            query.setParameter("contraseñaUsuario", contraseñaUsuario);

            List<Cuentas> results = query.getResultList();
            if (results != null && !results.isEmpty()) {
                return results.get(0);
            } else {
                return null;
            }
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            throw new RuntimeException("Error al validar el usuario.", e);
        }
    }

    public boolean registrarUsuario(Cuentas nuevaCuenta) {
        try {
            em.persist(nuevaCuenta);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}

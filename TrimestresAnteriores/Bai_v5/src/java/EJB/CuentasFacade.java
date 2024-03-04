/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import entity.Cuentas;
import static entity.Cuentas_.contraseña;
import static entity.Cuentas_.email;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


/**
 *
 * @author maria
 */
@Stateless
public class CuentasFacade extends AbstractFacade<Cuentas> implements CuentasFacadeLocal {

    @PersistenceContext(unitName = "Bai_v5PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CuentasFacade() {
        super(Cuentas.class);
    }
     @Override
    public Cuentas acceder(Cuentas cu){
        Cuentas cuentas = null;
        String consulta ="";

        try {
            consulta = "Select u from Cuentas u where c.email=?1 and c.contraseña=?2";
            Query query = em.createQuery(consulta);
            
            query.setParameter(1,cu.getEmail());
            query.setParameter(2,cu.getContraseña());
            List<Cuentas> lista = query.getResultList();
            if (!lista.isEmpty()){
                cuentas=lista.get(0);
            }
            // Resto del código para ejecutar la consulta y procesar los resultados
        } catch (Exception e) {
            throw e;
        }
        return cuentas;
    }
        
    
        
    
    
}

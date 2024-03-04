/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import EJB.UsersFacadeLocal;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author maria
 */
@Entity
public class manageUser implements Serializable {
    
    @Id
    private UsersFacadeLocal usersFacade ;
    
}

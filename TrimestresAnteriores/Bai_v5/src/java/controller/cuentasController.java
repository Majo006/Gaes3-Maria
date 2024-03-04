/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CuentasDao;
import entity.Cuentas;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.SessionScoped;

/**
 *
 * @author mariSa
 */
@ManagedBean (name = "cuentas")
@SessionScoped

public class cuentasController {
    private String email;
    private String login;
    private String contraseña;
    
    public String validaLogin() throws Exception {
        CuentasDao CUENTAS = new CuentasDao();
        Cuentas c = CUENTAS.validarCuenta(email, contraseña);
        if (c != null) {
            email = c.getEmail();
            return "../Vista/index_cliente.xhtml";
            
        } else {
            return "../login.xhtml";
        }
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
}

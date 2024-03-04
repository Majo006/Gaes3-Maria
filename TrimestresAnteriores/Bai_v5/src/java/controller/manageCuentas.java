/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import EJB.CuentasFacadeLocal;
import entity.Cuentas;
import java.io.Serializable;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author maria
 */
@Entity
@ManagedBean
@SessionScoped
public class manageCuentas implements Serializable {
 
   @Id
   private CuentasFacadeLocal cuentasFacade;
   private List<Cuentas> listaCuentas;
   private Cuentas cuentas;
   


    public CuentasFacadeLocal getCuentasFacade() {
        return cuentasFacade;
    }

    public void setCuentasFacade(CuentasFacadeLocal cuentasFacade) {
        this.cuentasFacade = cuentasFacade;
    }

    public List<Cuentas> getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(List<Cuentas> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }

    public Cuentas getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuentas cuentas) {
        this.cuentas = cuentas;
    }
   
   @PostConstruct
   public void init(){
       this.cuentas = new Cuentas();
       
   
   }
   public String validar(){
       String ruta="";
       Cuentas valor;
       try{
           valor=this.cuentasFacade.acceder(this.cuentas);
           if(valor!=null){
               ruta="index_cliente.xhtml";
           
           } else{
               FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario no registrado", null));
           }
       }catch(Exception ex){
           throw ex;
       }
       return ruta;
   }
}


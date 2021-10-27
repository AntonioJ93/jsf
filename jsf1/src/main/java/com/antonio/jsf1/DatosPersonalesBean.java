/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonio.jsf1;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author pryet
 */
@Named(value = "datosPersonalesBean")
@RequestScoped
public class DatosPersonalesBean {

    private String nombre;
    private Integer edad;

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String navegar1(){
        return "xxx";
    }
    
    public String navegar2(){
        return "xxx";
    }
    /**
     * Creates a new instance of DatosPersonalesBean
     */
    public DatosPersonalesBean() {
    }

}

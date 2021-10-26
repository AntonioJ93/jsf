/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonio.jsf1;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.ManagedProperty;

/**
 *
 * @author pryet
 */
@Named(value = "datosPersonalesBean")
@RequestScoped
public class DatosPersonalesBean {

    private String nombre;
    private Integer edad;
   

    @ManagedProperty(value = "#{param.pDestino}")
    private String pDestino;


    public Integer getEdad() {
        return edad;
    }

    public String getpDestino() {
        return pDestino;
    }

    public void setpDestino(String pDestino) {
        this.pDestino = pDestino;
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
        return "valorDevuelto";
    }
    public String navegar2(){
        return "valorDevuelto";
    }
    /**
     * Creates a new instance of DatosPersonalesBean
     */
    public DatosPersonalesBean() {
    }

}

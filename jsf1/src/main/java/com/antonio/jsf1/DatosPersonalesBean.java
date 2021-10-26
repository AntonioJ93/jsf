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
    private final String DESTINO="destino.xhtml";
    private final String DIFERENTE="diferente.xhtml";

    @ManagedProperty(value = "#{param.pDestino}")
    private String pDestino;

    public String getDESTINO() {
        return DESTINO;
    }

    public String getDIFERENTE() {
        return DIFERENTE;
    }

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

    public String evaluarDestino() {

        switch (pDestino) {
            case "1":
                return "destino.xhtml";

            case "2":
                return "diferente.xhtml";

            
        }
        return "inicio.xhtml";
    }

    /**
     * Creates a new instance of DatosPersonalesBean
     */
    public DatosPersonalesBean() {
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.formulariojsf.managedBeans;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author pryet
 */
@RequestScoped
@Named
public class Persona {
    
    private String nombre;
    private String email;
    private String sexo = "Mujer";
    private String provincia;
    private String[] marcaTelefoMovil;
    

  

    public Provincias[] getArrayProvincias() {
      
                return Provincias.values();
    }

   
    
    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the marcaTelefoMovil
     */
    public String[] getMarcaTelefoMovil() {
        return marcaTelefoMovil;
    }

    /**
     * @param marcaTelefoMovil the marcaTelefoMovil to set
     */
    public void setMarcaTelefoMovil(String[] marcaTelefoMovil) {
        this.marcaTelefoMovil = marcaTelefoMovil;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Sexo[] getValues() {
        return Sexo.values();
    }
    
    public Provincias[] getProvincias(){
        return Provincias.values();
    }

    public enum Sexo {
        HOMBRE("hombre"), MUJER("Mujer");

        private Sexo(String descripcion) {
            this.descripcion = descripcion;
        }

        private String descripcion;

        public String getDescripcion() {
            return descripcion;
        }

    }
    
    
    
}

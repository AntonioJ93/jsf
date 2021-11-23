/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.formulariojsf.managedBeans;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author pryet
 */
@RequestScoped
@Named
public enum Provincias {
    
    ALMERIA("Almeria"),GRANADA("Granada"),JAEN("Jaen"),MÁLAGA("Málaga"),CÓRDOBA("Córdoba"),SEVILLA("Sevilla"),
    HUELVA("Huelva"),CÁDIZ("Cádiz");
    
    private String provincia;

    private Provincias(String provincia ) {
        this.provincia = provincia;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    public int getOrden(){
        return this.ordinal();
    }
    
    public Provincias[] getProvincias(){
        return values();
    }
}

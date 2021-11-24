/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.midominio.mavenproject1.dominio;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author Antonio
 */
@ApplicationScoped
@Named
public enum Provincia {
    CORDOBA("Córdoba"),
    JAEN("Jaen"),
    MALAGA("Málaga"),
    GRANADA("Granada"),
    ALMERIA("Almeria"),
    CADIZ("Cádiz"),
    HUELVA("Huelva"),
    SEVILLA("Sevilla");
    
    private String nombre;

    private Provincia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}

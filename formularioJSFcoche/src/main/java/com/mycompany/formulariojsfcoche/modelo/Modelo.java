/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.formulariojsfcoche.modelo;

/**
 *
 * @author pryet
 */
public enum Modelo {
    
    CLIO("Clio"), MEGANE("Megane"),LAGUNA("Laguna"), KANGO("Kango");
    
    private String nombre;

    private Modelo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

}

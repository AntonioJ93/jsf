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
public enum Sexo {
    HOMBRE("Hombre"),
    MUJER("Mujer");
    
    private String valor;

    private Sexo(String valor) {
        this.valor = valor;
    }
    
    public Sexo[] getSexos(){
        return values();
    }

    public String getValor() {
        return valor;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.midominio.mavenproject1.dominio;

import static com.midominio.mavenproject1.dominio.Sexo.values;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author Antonio
 */
@Named(value = "bbdd")
@ApplicationScoped
public class BBDD {

    private List<String> listaMoviles;
    private List<Aficion> aficiones;

    public BBDD() {
        this.listaMoviles = new ArrayList<>();
        listaMoviles.add("Xiaomi");
        listaMoviles.add("Sony");
        listaMoviles.add("Iphone");
        listaMoviles.add("Samsung");
        this.aficiones=new ArrayList<>();
        aficiones.add(new Aficion("Fútbol"));
        aficiones.add(new Aficion("Baloncesto"));
        aficiones.add(new Aficion("Tenis"));
        aficiones.add(new Aficion("Tiro con arco"));

    }

    public List<Aficion> getAficiones() {
        return aficiones;
    }

    public void setAficiones(List<Aficion> aficiones) {
        this.aficiones = aficiones;
    }

    
    
    public Sexo[] getSexos() {
        return Sexo.values();
    }

    public List<String> getListaMoviles() {
        return listaMoviles;
    }

    public void setListaMoviles(List<String> listaMoviles) {
        this.listaMoviles = listaMoviles;
    }

    public Provincia[] getProvincias() {
        return Provincia.values();
    }

}

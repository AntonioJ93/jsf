/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.midominio.mavenproject1.managedBeans;

import com.midominio.mavenproject1.dominio.Aficion;
import com.midominio.mavenproject1.dominio.Provincia;
import com.midominio.mavenproject1.dominio.Sexo;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.inject.Model;

/**
 *
 * @author Antonio
 */
@Model
public class Persona {

    private String nombre;
    private String correo;
    private Sexo sexo;
    private List<String> marcasMoviles;
    private List<Aficion> aficiones;
    private Provincia provincia;

    public Persona() {
        marcasMoviles = new ArrayList<>();
    }

    public List<Aficion> getAficiones() {
        return aficiones;
    }

    public void setAficiones(List<Aficion> aficiones) {
        this.aficiones = aficiones;
    }
    

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public List<String> getMarcasMoviles() {
        return marcasMoviles;
    }

    public void setMarcasMoviles(List<String> marcasMoviles) {
        this.marcasMoviles = marcasMoviles;
    }

}

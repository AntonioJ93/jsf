/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ajaxjsf;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;


@Named(value = "personaBean")
@ViewScoped
public class PersonaBean implements Serializable{

    public PersonaBean() {
    }

    private String nombre;
    private String apellido;
    private String msjError;
    private boolean disabledBoton;
    private boolean disabledCampo;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMsjError() {
        return msjError;
    }

    public void setMsjError(String msjError) {
        this.msjError = msjError;
    }
    
    public String disabled(){
        if(nombre!=null&& nombre.trim().length()>0){
            disabledCampo= false;
            return "false";
        }
        disabledCampo= true;
        return "true";
    }
    
    public void validar(){
        if(!nombre.equals(apellido)){
            msjError="Los campos deben coincidir";
        }else{
            msjError=null;
        }
    }
    public String disabledBoton(){
        disabledBoton=msjError!=null&&disabledCampo;
        return String.valueOf(disabledBoton);
        
    }
}

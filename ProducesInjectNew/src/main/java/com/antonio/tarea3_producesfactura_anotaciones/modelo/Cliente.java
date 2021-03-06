/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonio.tarea3_producesfactura_anotaciones.modelo;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author pryet
 */
@Named
@RequestScoped
public class Cliente {
    private String nombre;
    private int codigoCliente;

    public static ClienteBuilder builder(String nombre){
        return new ClienteBuilder(nombre);
    }
    
    @PostConstruct
    public void init(){
        nombre="Paco";
        codigoCliente=111;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    public static class ClienteBuilder{
        private final Cliente cliente;
        private ClienteBuilder(String nombre) {
            cliente=new Cliente();
            cliente.nombre=nombre;
        }
        
        public ClienteBuilder codigo(int codigo){
            cliente.codigoCliente=codigo;
            return this;
        }
        public Cliente build(){
            return cliente;
        }
    }
}

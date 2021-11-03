/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonio.tarea3_producesfactura_anotaciones.modelo;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author pryet
 */

public class Factura {
    
    private List<LineaFactura> lineasFactura;
    private Cliente cliente;
    
    
    public Factura(){
        lineasFactura=new ArrayList<>();
    }
    
    public void addLineaFactura(LineaFactura lineaaFactura){
        lineasFactura.add(lineaaFactura);
    }

    public List<LineaFactura> getLineasFactura() {
        return lineasFactura;
    }

    public void setLineasFactura(List<LineaFactura> lineasFactura) {
        this.lineasFactura = lineasFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    @Inject
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}

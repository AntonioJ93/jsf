/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonio.tarea3_producesfactura_anotaciones.controlador;

import com.antonio.tarea3_producesfactura_anotaciones.modelo.Factura;
import com.antonio.tarea3_producesfactura_anotaciones.modelo.LineaFactura;
import com.antonio.tarea3_producesfactura_anotaciones.modelo.Producto;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.CDI;


/**
 *
 * @author pryet
 */

public class Controlador {

    @Model
    @Produces
    public Factura getFactura(@New Factura factura) {
       factura.addLineaFactura(new LineaFactura(new Producto("Producto A", 123), 2));
       factura.addLineaFactura(new LineaFactura(new Producto("Producto B", 222), 1));  
        return factura;
    }


 
    
}

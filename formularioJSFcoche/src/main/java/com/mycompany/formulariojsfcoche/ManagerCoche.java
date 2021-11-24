/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.formulariojsfcoche;

import com.mycompany.formulariojsfcoche.modelo.ABS;
import com.mycompany.formulariojsfcoche.modelo.Coche;
import com.mycompany.formulariojsfcoche.modelo.Extra;
import com.mycompany.formulariojsfcoche.modelo.GPS;
import com.mycompany.formulariojsfcoche.modelo.Modelo;
import com.mycompany.formulariojsfcoche.modelo.Uso;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

/**
 *
 * @author pryet
 */
@Model
public class ManagerCoche {

    @Inject
    private Coche coche;
    private Modelo modelo;
    private Uso uso;
    private List<Extra> extras;

    @PostConstruct
    private void cargarExtras() {
        extras = new ArrayList<>();
        extras.add(new ABS());
        extras.add(new GPS());
        coche.setModelo(Modelo.CLIO);
        coche.setUso(Uso.PARTICULAR);

    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public Modelo[] getModelos() {
        return Modelo.values();
    }

    public Uso[] getUsos() {
        return Uso.values();
    }

    public List<Extra> getExtras() {
        return extras;
    }

}

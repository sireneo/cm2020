/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sijc.org;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author SantOS
 */
@Named(value = "inputBean")
@RequestScoped
public class InputBean {

    /**
     * Creates a new instance of InputBean
     */
    public InputBean() {
    }
    private String nombre;
    private String fecha;
    private String fono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFono() {
        return fono;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }
    
    
}

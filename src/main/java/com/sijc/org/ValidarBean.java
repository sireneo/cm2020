/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sijc.org;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 *
 * @author SantOS
 */
@Named(value = "validarBean")
@RequestScoped
public class ValidarBean {
    @Size(min=3, max=10)
    private String nombre;
    
    @Size(min = 3, max = 15)
    private String apellido;
    
    @Min(18) @Max(40)
    private Integer edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public void saludo(){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("hola bienvenido: "+ nombre + " "+ apellido));
    }
    
}

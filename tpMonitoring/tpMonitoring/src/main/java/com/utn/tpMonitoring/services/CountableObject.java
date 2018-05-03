/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utn.tpMonitoring.services;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Alumno
 */

public class CountableObject {
    
    Long cantidad;
    String type;
    
    @Autowired
    public CountableObject(Long cantidad, String type) {
        this.cantidad = cantidad;
        this.type = type;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public String getType() {
        return type;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
    
}

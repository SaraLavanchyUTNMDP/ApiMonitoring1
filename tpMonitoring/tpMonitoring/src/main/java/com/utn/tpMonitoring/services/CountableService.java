/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utn.tpMonitoring.services;

/**
 *
 * @author Alumno
 */
public class CountableService {
    Long quantity;
    String browser;
    String operativeSistem;

    public CountableService(Long quantity, String browser, String operativeSistem) {
        this.quantity = quantity;
        this.browser = browser;
        this.operativeSistem = operativeSistem;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long countBrowser) {
        this.quantity = countBrowser;
    }
    
    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getOperativeSistem() {
        return operativeSistem;
    }

    public void setOperativeSistem(String operativeSistem) {
        this.operativeSistem = operativeSistem;
    }
    
    
}

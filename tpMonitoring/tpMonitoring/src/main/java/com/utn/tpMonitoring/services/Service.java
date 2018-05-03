/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utn.tpMonitoring.services;

/**
 *
 * @author Lavanchy
 */
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;



@Entity(name = "myService")
@Table(name = "browserService")
public class Service {
    
    @Id
    @GeneratedValue
    @Column(name = "idService")
    private int myServiceId;

    @Column (name = "operativeSistem")
    private String operativeSistem;

    @Column (name = "browser" )
    private String browser;

    //Constructor
    public Service(){}
    public Service( String operativeSistem, String browser) {
        this.operativeSistem = operativeSistem;
        this.browser = browser;
    }

    //getters and setters
    public int getMyServiceId() {
        return myServiceId;
    }

    public String getOperativeSistem() {
        return operativeSistem;
    }

    public String getBrowser() {
        return browser;
    }

    public void setMyServiceId(int myServiceId) {
        this.myServiceId = myServiceId;
    }

    public void setOperativeSistem(String operativeSistem) {
        this.operativeSistem = operativeSistem;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }
}
    


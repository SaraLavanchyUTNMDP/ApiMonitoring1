/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utn.tpMonitoring.controllers;
import com.utn.tpMonitoring.repository.Irepository;
import com.utn.tpMonitoring.services.CountableObject;
import com.utn.tpMonitoring.services.CountableService;
import com.utn.tpMonitoring.services.Service;

import java.util.List;
import net.sf.uadetector.ReadableUserAgent;
import net.sf.uadetector.service.UADetectorServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Lavanchy
 */

@RestController
@RequestMapping(value = "/Service", produces = MediaType.APPLICATION_JSON_VALUE)
public class ServiceController {
    
    @Autowired
    private Irepository serviceRepository;
    
    @RequestMapping(value= "/Client", method =RequestMethod.GET)
    @ResponseBody
    public Service getInformation(@RequestHeader(value = "User-Agent") String clientInformation){
        String status;
        Service myClient = null;
        try{
            ReadableUserAgent information = UADetectorServiceFactory.getResourceModuleParser().parse(clientInformation);
            myClient = new Service(information.getOperatingSystem().getName(), information.getFamily().getName());
            serviceRepository.save(myClient);
            status = "usted ha entrado desde un ordenador con sistema operativo: " + information.getOperatingSystem().getName()
                    +" y ha usado el navegador: " + information.getFamily().getName();
        }catch(Exception e){
            status = "ha ocurrido un error, vaya a tomar un te";
        }
        return myClient;
    }
    
    
    @RequestMapping("/all")
    public List<Service> findall(){
        return serviceRepository.findAll();
    }
    
    @RequestMapping("/OperativeSistem")
    public CountableObject moreUsedOS(){
        CountableObject operativeSistem = null;
        try{
            List<CountableObject> os = serviceRepository.moreUsedOS();
            operativeSistem = os.get(0);
        }catch(Exception e){
           operativeSistem = new CountableObject(0L, " ");
        }       
        return operativeSistem; 
    }
    
    @RequestMapping("/Browser")
    public CountableObject moreUsedBrowser(){
        CountableObject browser = null;
        try{
            List<CountableObject> os = serviceRepository.moreUsedBrowser();
            browser = os.get(0); 
        }catch(Exception e){
            browser = new CountableObject(0L, " ");
        }
        return browser;
    }
    
    @RequestMapping("/OperativeSistemAndBrowser")
    public CountableService moreUsed(){
        CountableService OSBrowser = null;
        try{
            List<CountableService> both = serviceRepository.moreUsedBoth();
            OSBrowser = both.get(0);
        }catch(Exception e){
            OSBrowser = new CountableService(0L, " ", " ");
        }        
        return OSBrowser;        
    }

}

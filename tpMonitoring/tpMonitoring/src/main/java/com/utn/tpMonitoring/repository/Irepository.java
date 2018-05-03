package com.utn.tpMonitoring.repository;

import com.utn.tpMonitoring.services.CountableObject;
import com.utn.tpMonitoring.services.CountableService;
import org.springframework.data.jpa.repository.JpaRepository;
import com.utn.tpMonitoring.services.Service;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Lavanchy
 */

public interface Irepository extends JpaRepository<Service, Integer> {
    @Query("Select new com.utn.tpMonitoring.services.CountableObject(count(browser), browser) from myService group by browser order by count(browser) DESC")
    public List<CountableObject> moreUsedBrowser();
    
    @Query("Select new com.utn.tpMonitoring.services.CountableObject(count(operativeSistem), operativeSistem) from myService group by operativeSistem order by count(operativeSistem) DESC")
    public List<CountableObject> moreUsedOS();
    
    @Query("Select new com.utn.tpMonitoring.services.CountableService(count(*), operativeSistem, browser) "
            + "from myService group by operativeSistem, browser order by count(*) DESC")
    public List<CountableService> moreUsedBoth();
}

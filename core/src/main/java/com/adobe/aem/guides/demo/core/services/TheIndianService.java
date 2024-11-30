package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service =TheIndianService.class,immediate=true, enabled = true)
public class TheIndianService {
    
    private static final Logger LOG=LoggerFactory.getLogger(TheIndianService.class);

    @Activate
    public void activate() 
    {
        
        LOG.info("TheIndianServices activate() started");
    }
    @Deactivate
    public void deactivate()
    {
        LOG.info("TheIndianServices deactivate() Ended");
    }
    @Modified
    public void modify()
    {
        LOG.info("TheIndian services activate() modified");
    } 

    public String printData()
    {
        return "Print The TheIndianExpress is Part of TheIndianServices";
    }

}



package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true)
public class TheIndianExpress {


    private static final Logger LOG=LoggerFactory.getLogger(TheIndianExpress.class);

    @Reference
    TheIndianService has;

    @Activate
    public void activate() 
    {
        String result=has.printData();
        LOG.info(" TheIndianExpress activate() started");
        LOG.info("Result {}",result); 
        
    }
    @Deactivate
    public void deactivate()
    {
        LOG.info(" TheIndianExpress deactivate() Ended");
    }
    @Modified
    public void modify()
    {
        LOG.info(" TheIndianExpress activate() modified");
    } 

    
}

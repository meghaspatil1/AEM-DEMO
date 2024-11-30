package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true)
public class IndianService {
    private static final Logger LOG=LoggerFactory.getLogger(IndianService.class);

    @Activate
    public void activate() 
    {
        LOG.info("IndianServices activate() started");
    }
    @Deactivate
    public void deactivate()
    {
        LOG.info("IndianServices deactivate() End");
    }
    @Modified
    public void update()
    {
        LOG.info("Indian services activate() update");
    } 
}

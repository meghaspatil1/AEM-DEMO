package com.adobe.aem.guides.demo.core.services;

import org.eclipse.jetty.util.log.Log;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Component(service = EmployeeDetails.class,immediate=true,enabled=true)
@Designate(ocd = EmployeeConfig.class)

public class EmployeeDetails {
    private static final Logger LOG=LoggerFactory.getLogger(EmployeeDetails.class);

    private int empId;
    private String empName;
    private String empSecret;
    private String restApi;
    
    @Activate
    public void activate(EmployeeConfig employeeConfig) 
    {
        LOG.info("EmployeeDetails activate");
        updateEmpDetails(employeeConfig);  
    }
    @Deactivate
    public void deactivate(EmployeeConfig employeeConfig)
    {
        LOG.info(" EmployeeDetails deactivate()");
        updateEmpDetails(employeeConfig); 
    }
    @Modified
    public void modify(EmployeeConfig employeeConfig)
    {
        LOG.info(" EmployeeDetails Modify()");
        updateEmpDetails(employeeConfig); 
    } 

    public void updateEmpDetails(EmployeeConfig employeeConfig)
    {
        this.empId=employeeConfig.empId();
        this.empName=employeeConfig.empName();
        this.empSecret=employeeConfig.empSecret();
        this.restApi=employeeConfig.empRestApi();
        LOG.info("empId is {},empName{},empSecret{},restApi",empId,empName,empSecret,restApi);
    }
}




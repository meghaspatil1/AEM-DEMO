package com.adobe.aem.guides.demo.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "EmployeeConfig",description = "about EmployeeConfig")

public @interface EmployeeConfig {

    @AttributeDefinition(name = "empId",
    description = "about empId",
    defaultValue = "pls enter emp Id",
    type = AttributeType.STRING
    )
    public int empId();

    @AttributeDefinition(name="empName",
    description = "about empName",
    defaultValue = "pls Enter Emp Name",
    type = AttributeType.STRING
    )
    public String empName();

    @AttributeDefinition(name="empSecret",
    description = "about eempSecret",
    defaultValue = "pls Enter Emp Secret value",
    type = AttributeType.STRING
    )
    public String empSecret();

    @AttributeDefinition(name = "empRestApi",
    description = "about empRestApi",
    defaultValue = "pls Enter Emp empRestApi value",
    type = AttributeType.STRING
    )
    public String empRestApi();

}

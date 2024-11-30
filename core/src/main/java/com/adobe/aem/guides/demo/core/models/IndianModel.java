package com.adobe.aem.guides.demo.core.models;

import java.util.Date;
import java.util.List;

public interface IndianModel {
    public String getIndianTitle();
    public String getIndianDes();
    public String getIndianImage();
    public Date getIndianPublishDate();
    public int getIndianNumber();
    public List<String> getIndianMultifield();
    public String getPageName();
    public String getJcrCreated();

}

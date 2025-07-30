package com.cognizant.springlearn;
public class Country {
    private String countryCode;
    private String countryName;
    
    public Country() { }
    
    public String getCode() { 
        return countryCode; 
    }
    
    public void setCode(String countryCode) { 
        this.countryCode = countryCode; 
    }
    
    public String getName() { 
        return countryName; 
    }
    
    public void setName(String countryName) { 
        this.countryName = countryName; 
    }
}

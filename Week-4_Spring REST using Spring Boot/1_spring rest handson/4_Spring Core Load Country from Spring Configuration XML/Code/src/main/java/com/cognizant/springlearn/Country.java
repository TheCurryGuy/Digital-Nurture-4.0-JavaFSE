package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {

    private static final Logger applicationLogger = LoggerFactory.getLogger(Country.class);

    private String countryCode;
    private String countryName;

    public Country() {
        applicationLogger.debug("Country object is being created right now.");
    }

    public String getCode() {
        applicationLogger.debug("Fetching country code: {}", countryCode);
        return countryCode;
    }

    public void setCode(String countryCode) {
        applicationLogger.debug("Setting country code to: {}", countryCode);
        this.countryCode = countryCode;
    }

    public String getName() {
        applicationLogger.debug("Retrieving country name: {}", countryName);
        return countryName;
    }

    public void setName(String countryName) {
        applicationLogger.debug("Updating country name to: {}", countryName);
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "Country{code='" + getCode() + "', name='" + getName() + "'}";
    }
}

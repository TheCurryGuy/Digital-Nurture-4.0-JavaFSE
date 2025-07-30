package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    private final CountryService countryManagementService;

    @Autowired
    public CountryController(CountryService countryManagementService) {
        this.countryManagementService = countryManagementService;
    }

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String countryCode) {
        return countryManagementService.getCountry(countryCode);
    }
}

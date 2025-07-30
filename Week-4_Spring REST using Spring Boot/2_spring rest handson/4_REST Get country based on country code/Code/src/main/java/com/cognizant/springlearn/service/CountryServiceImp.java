package com.cognizant.springlearn.service;

import com.cognizant.springlearn.Country;
import org.springframework.stereotype.Service;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@Service
public class CountryServiceImp implements CountryService {

    private final List<Country> nationDataList;

    public CountryServiceImp() {
        // Initialize Spring XML configuration and load the List<Country>
        try (var springContext = new ClassPathXmlApplicationContext("country.xml")) {
            //noinspection unchecked
            this.nationDataList = (List<Country>) springContext.getBean("countryList", List.class);
        }
    }

    @Override
    public Country getCountry(String countryCode) {
        // Performing case-insensitive lookup
        return nationDataList.stream()
                .filter(countryItem -> countryItem.getCode().equalsIgnoreCase(countryCode))
                .findFirst()
                .orElse(null);
    }
}

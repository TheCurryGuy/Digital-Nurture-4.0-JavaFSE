package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmlearnApplication {

	private static final Logger applicationLogger = LoggerFactory.getLogger(OrmlearnApplication.class);
	private static CountryService countryManagementService;

	public static void main(String[] args) {
		ApplicationContext springApplicationContext = SpringApplication.run(OrmlearnApplication.class, args);
		countryManagementService = springApplicationContext.getBean(CountryService.class);
		demonstrateCountryRetrieval();
	}

	private static void demonstrateCountryRetrieval() {
		applicationLogger.info("Beginning country data retrieval demonstration...");
		List<Country> allCountriesData = countryManagementService.getAllCountries();
		applicationLogger.debug("Retrieved countries data: {}", allCountriesData);
		applicationLogger.info("Country data retrieval demonstration completed.");
	}
}

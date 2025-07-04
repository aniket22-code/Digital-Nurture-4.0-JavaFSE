package com.cognizant;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext; // ✅ required

import com.cognizant.ormlearn.model.Country.Country;
import com.cognizant.ormlearn.service.CountryService.CountryService;



@SpringBootApplication
public class OrmLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	private static CountryService countryService;
	

	public static void main(String[] args) {
ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        
        
        countryService = context.getBean(CountryService.class);

        
        testGetAllCountries();
	}
	
    private static void testGetAllCountries() {
        LOGGER.info("Start");
        List<Country> countries = countryService.getAllCountry();
        LOGGER.debug("countries={}", countries);
        LOGGER.info("End");
    }

}




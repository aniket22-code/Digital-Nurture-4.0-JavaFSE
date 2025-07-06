package com.cognizant;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country.Country;
import com.cognizant.ormlearn.service.CountryService.CountryService;

@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

		CountryService countryService = context.getBean(CountryService.class);

		LOGGER.info("START - Creating a new country");

		Country newCountry = new Country();
		newCountry.setCode("JP");
		newCountry.setName("Japan");

		countryService.addCountry(newCountry);

		LOGGER.info("Country saved successfully: {}", newCountry);

		LOGGER.info("END - Application finished");
	}
}

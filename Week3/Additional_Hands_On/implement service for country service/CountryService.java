package com.cognizant.ormlearn.service.CountryService;

import java.util.List;
import java.util.Optional;

import com.cognizant.ormlearn.model.Country.Country;

public interface CountryService {
	
	public Country addCountry(Country country);
	public Optional<Country> findCountryByCode(String code) ;
	public List<Country> getAllCountry();
	public void deleteCountry(String code);
	Country updateCountry(String code, String name);
	

}

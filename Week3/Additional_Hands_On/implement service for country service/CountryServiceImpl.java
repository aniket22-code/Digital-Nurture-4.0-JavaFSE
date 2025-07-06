package com.cognizant.ormlearn.service.CountryService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ormlearn.CountryRepository.CountryRepository;
import com.cognizant.ormlearn.model.Country.Country;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryRepository countryRepository;

	@Override
	@Transactional
	public Country addCountry(Country country) {
		return countryRepository.save(country);

	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Country> findCountryByCode(String code) {
		return countryRepository.findById(code);
	}

	@Override
	@Transactional(readOnly =true)
	public List<Country> getAllCountry() {
		return countryRepository.findAll();
	}

	@Override
	public Country updateCountry(String code, String name) throws CountryNotFoundException {
		Optional<Country> result=countryRepository.findById(code);
		if(!result.isPresent()) {
			throw new CountryNotFoundException("Country not found with the code "+code);
		}else {
			Country country = result.get();
	        country.setName(name);
	        return countryRepository.save(country);
		}
		

	}

	@Override
	@Transactional
	public void deleteCountry(String code) {
		countryRepository.deleteById(code);

	}

	

}

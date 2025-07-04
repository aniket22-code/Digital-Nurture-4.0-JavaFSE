package com.cognizant.ormlearn.CountryRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.ormlearn.model.Country.Country;

public interface CountryRepository extends JpaRepository<Country, String> {

}

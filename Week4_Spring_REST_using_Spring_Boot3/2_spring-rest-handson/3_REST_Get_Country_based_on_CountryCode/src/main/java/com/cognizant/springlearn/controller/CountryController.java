package com.cognizant.spring_learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.Service.CountryService;
import com.cognizant.spring_learn.model.Country;

@RestController
public class CountryController {

	@Autowired
	private CountryService countryService;

	@GetMapping("/countries/{code}")
	public Country getCountry(@PathVariable String code) {
		return (Country) countryService.getCountry(code);
	}
}


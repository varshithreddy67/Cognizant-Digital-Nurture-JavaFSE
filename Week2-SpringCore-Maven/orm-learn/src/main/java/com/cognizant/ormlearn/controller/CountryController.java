package com.cognizant.ormlearn.controller;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/country/{code}")
    public Country getCountry(@PathVariable String code) {
        return countryService.getCountry(code);
    }

    @GetMapping("/countries/search/{name}")
    public List<Country> searchCountries(@PathVariable String name) {
        return countryService.searchCountries(name);
    }
    @GetMapping("/countries/starts-with/{prefix}")
    public List<Country> getCountriesStartingWith(
            @PathVariable String prefix) {

        return countryService.getCountriesStartingWith(prefix);
    }
}
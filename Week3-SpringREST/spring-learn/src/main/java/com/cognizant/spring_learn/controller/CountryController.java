package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.model.Country;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.cognizant.spring_learn.exception.CountryNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import jakarta.validation.Valid;

@RestController
public class CountryController {

    @RequestMapping("/country")
    public Country getCountryIndia() {

        return new Country("IN", "India");
    }

    @PostMapping("/countries")
    public Country addCountry(@Valid @RequestBody Country country) {

        System.out.println("Country Code : " + country.getCode());
        System.out.println("Country Name : " + country.getName());

        return country;
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries() {

        List<Country> countries = new ArrayList<>();

        countries.add(new Country("IN", "India"));
        countries.add(new Country("US", "United States"));
        countries.add(new Country("JP", "Japan"));
        countries.add(new Country("DE", "Germany"));

        return countries;
    }

    @DeleteMapping("/countries/{code}")
    public String deleteCountry(@PathVariable String code) {

        System.out.println("Deleted Country : " + code);

        return "Country with code " + code + " deleted successfully";
    }

    @PutMapping("/countries")
    public Country updateCountry(@Valid @RequestBody Country country) {

        System.out.println("Updated Country Code : " + country.getCode());
        System.out.println("Updated Country Name : " + country.getName());

        return country;
    }

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {

        List<Country> countries = new ArrayList<>();

        countries.add(new Country("IN", "India"));
        countries.add(new Country("US", "United States"));
        countries.add(new Country("JP", "Japan"));
        countries.add(new Country("DE", "Germany"));

        for (Country country : countries) {

            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }
        }


        throw new CountryNotFoundException();
    }

}
package com.cognizant.spring_learn.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Country {

    @NotBlank(message = "Country code cannot be empty")
    @Size(
            min = 2,
            max = 2,
            message = "Country code must be exactly 2 characters"
    )
    private String code;

    @NotBlank(message = "Country name cannot be empty")
    @Size(
            min = 3,
            max = 30,
            message = "Country name must be between 3 and 30 characters"
    )
    private String name;

    public Country() {
    }

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
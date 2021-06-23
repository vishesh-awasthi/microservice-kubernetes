package com.visheshawasthi.controller;

import com.visheshawasthi.exception.CountryNotFoundException;
import com.visheshawasthi.model.Country;
import com.visheshawasthi.service.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/countries")
@AllArgsConstructor
public class CountryController {

  private final CountryService countryService;

  @GetMapping()
  public ResponseEntity<List<Country>> getCountries() {
    return new ResponseEntity<>(countryService.getCountries(), HttpStatus.OK);
  }

  @GetMapping("/id/{id}")
  public ResponseEntity<Country> getCountryById(@PathVariable String id) throws CountryNotFoundException {
    return new ResponseEntity<>(countryService.getCountryById(id), HttpStatus.OK);
  }

  @GetMapping("/name/{name}")
  public ResponseEntity<Country> getCountryByName(@PathVariable String name) throws CountryNotFoundException {
    return new ResponseEntity<>(countryService.getCountryByName(name), HttpStatus.OK);
  }

  @GetMapping("/code/{code}")
  public ResponseEntity<Country> getCountryByCode(@PathVariable String code,
      @RequestParam(value = "statesIncluded", required = false) boolean statesIncluded)
      throws CountryNotFoundException {
    return new ResponseEntity<>(countryService.getCountryByCode(code, statesIncluded), HttpStatus.OK);
  }
}

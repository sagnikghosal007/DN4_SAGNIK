package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.Country;
import org.springframework.stereotype.Service;

@Service
public interface CountryService {
    Country getCountry(String code);
}

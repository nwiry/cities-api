package com.github.diogocqr.citiesapi.repository;

import com.github.diogocqr.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}

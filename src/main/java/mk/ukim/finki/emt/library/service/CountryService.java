package mk.ukim.finki.emt.library.service;

import mk.ukim.finki.emt.library.model.entities.Country;

import java.util.List;

public interface CountryService {
    List<Country> listAll();
    Country create(String name, String continent);
}

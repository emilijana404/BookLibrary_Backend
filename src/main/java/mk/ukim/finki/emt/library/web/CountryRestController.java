package mk.ukim.finki.emt.library.web;

import mk.ukim.finki.emt.library.model.entities.Country;
import mk.ukim.finki.emt.library.service.CountryService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://book-library--frontend.herokuapp.com")
@RequestMapping("/countries")
public class CountryRestController {

    private final CountryService countryService;

    public CountryRestController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping
    public List<Country> findAll(){

        return this.countryService.listAll();
    }
}

package mk.ukim.finki.emt.library.service;

import mk.ukim.finki.emt.library.model.entities.Author;

import java.util.List;

public interface AuthorService {
    List<Author> listAll();
    Author create(String name, String surname, Long countryId);
}

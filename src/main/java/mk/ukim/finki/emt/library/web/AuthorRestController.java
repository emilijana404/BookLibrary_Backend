package mk.ukim.finki.emt.library.web;

import mk.ukim.finki.emt.library.model.entities.Author;
import mk.ukim.finki.emt.library.service.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://book-library--frontend.herokuapp.com")
@RequestMapping("/authors")
public class AuthorRestController {

    private final AuthorService authorService;

    public AuthorRestController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public List<Author> findAll(){

        return this.authorService.listAll();
    }
}

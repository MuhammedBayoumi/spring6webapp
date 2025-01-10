package guru.springbootframwork.spring6webapp.controllers;


import guru.springbootframwork.spring6webapp.repositories.AuthorRepository;
import guru.springbootframwork.spring6webapp.services.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Field;

@Controller
public class AuthorController
{
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }


    @RequestMapping("/authors")
    public String getAuthor (Model model)
    {
        model.addAttribute("author" , authorService.findAll());
        return "authors";
    }
}

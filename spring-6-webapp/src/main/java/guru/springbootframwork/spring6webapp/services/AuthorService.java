package guru.springbootframwork.spring6webapp.services;

import guru.springbootframwork.spring6webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();

}

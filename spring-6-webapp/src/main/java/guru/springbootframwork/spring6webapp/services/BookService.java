package guru.springbootframwork.spring6webapp.services;

import guru.springbootframwork.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}

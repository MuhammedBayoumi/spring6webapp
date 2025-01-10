package guru.springbootframwork.spring6webapp.services;

import guru.springbootframwork.spring6webapp.domain.Publisher;

public interface PublisherService {
    Iterable<Publisher> findAll();
}

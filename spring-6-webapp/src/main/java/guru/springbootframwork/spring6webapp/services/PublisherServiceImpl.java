package guru.springbootframwork.spring6webapp.services;

import guru.springbootframwork.spring6webapp.domain.Publisher;
import guru.springbootframwork.spring6webapp.repositories.PublisherRepository;
import org.hibernate.annotations.processing.Find;
import org.springframework.stereotype.Service;

@Service
public class PublisherServiceImpl implements PublisherService {
    private final PublisherRepository publisherRepository;

    public PublisherServiceImpl(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public Iterable<Publisher> findAll() {
        return publisherRepository.findAll();
    }
}

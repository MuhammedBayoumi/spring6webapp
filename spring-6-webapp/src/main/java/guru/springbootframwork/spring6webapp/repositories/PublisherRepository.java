package guru.springbootframwork.spring6webapp.repositories;

import guru.springbootframwork.spring6webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}

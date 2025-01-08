package guru.springbootframwork.spring6webapp.repositories;

import guru.springbootframwork.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long>
{

}

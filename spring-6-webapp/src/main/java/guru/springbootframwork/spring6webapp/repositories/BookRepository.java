package guru.springbootframwork.spring6webapp.repositories;

import guru.springbootframwork.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long>
{
}

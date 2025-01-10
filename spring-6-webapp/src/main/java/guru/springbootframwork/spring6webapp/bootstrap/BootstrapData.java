package guru.springbootframwork.spring6webapp.bootstrap;

import guru.springbootframwork.spring6webapp.domain.Author;
import guru.springbootframwork.spring6webapp.domain.Book;
import guru.springbootframwork.spring6webapp.domain.Publisher;
import guru.springbootframwork.spring6webapp.repositories.AuthorRepository;
import guru.springbootframwork.spring6webapp.repositories.BookRepository;
import guru.springbootframwork.spring6webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;


    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author author1 = new Author();
        Author author2 = new Author();
        Book book1 = new Book();
        Book book2 = new Book();
        Publisher publisher1 = new Publisher();
        Publisher publisher2 = new Publisher();

        author1.setFirstName("Mohamed");
        author1.setLastName("Bayoumi");

        author2.setFirstName("Gika");
        author2.setLastName("Adarsy");

        book1.setTitle("Nat_SEE");
        book1.setIsbn("123456");

        book2.setTitle("book2");
        book2.setIsbn("985694");

        publisher1.setPublisherName("Elrwad");
        publisher1.setAddress("Egypt");
        publisher1.setCity("Nasr City");
        publisher1.setState("Cairo");

        publisher2.setPublisherName("Ra2eg");
        publisher2.setAddress("Egypt");
        publisher2.setCity("New Cairo City");
        publisher2.setState("Cairo");




        Author author1Save = authorRepository.save(author1);
        Author author2Save = authorRepository.save(author2);

        Book book1Save = bookRepository.save(book1);
        Book book2Save = bookRepository.save(book2);

        Publisher publisher1Save=publisherRepository.save(publisher1);
        Publisher publisher2Save=publisherRepository.save(publisher2);

        // Add books to authors
        author1Save.getBooks().add(book1Save);
        author2Save.getBooks().add(book2Save);

        // Add authors to books
        book1Save.getAuthors().add(author1Save);
        book2Save.getAuthors().add(author2Save);
        book1Save.setPublisher(publisher1Save);
        book2Save.setPublisher(publisher2Save);
        // Save authors again to update the relationship
        authorRepository.save(author1Save);
        authorRepository.save(author2Save);

        // Save books again to update the relationship
        bookRepository.save(book1Save);
        bookRepository.save(book2Save);

        System.err.println("In Bootstrap run function");
        System.err.println("Author count: " + authorRepository.count());
        System.err.println("Book count: " + bookRepository.count());
    }


}

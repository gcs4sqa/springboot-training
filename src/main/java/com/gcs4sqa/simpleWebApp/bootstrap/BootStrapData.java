package com.gcs4sqa.simpleWebApp.bootstrap;

import com.gcs4sqa.simpleWebApp.domain.Author;
import com.gcs4sqa.simpleWebApp.domain.Book;
import com.gcs4sqa.simpleWebApp.domain.Publisher;
import com.gcs4sqa.simpleWebApp.repositories.AuthorRespository;
import com.gcs4sqa.simpleWebApp.repositories.BookRepository;
import com.gcs4sqa.simpleWebApp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    final private AuthorRespository authorRespository;
    final private BookRepository bookRepository;
    final private PublisherRepository publisherRepository;

    public BootStrapData(AuthorRespository authorRespository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRespository = authorRespository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher publisher = new Publisher();
        publisher.setName("SFG Publishing");
        publisher.setCity("Orlando");
        publisher.setState("FL");
        publisher.setAddressLine1("7700 Westgate Bulivade");
        publisher.setZip("FL12345");

        publisherRepository.save(publisher);

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123456");

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);



        authorRespository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

        Author rod = new Author("rod", "johnson");
        Book noEJB = new Book("JEE", "98765");

        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        publisher.getBooks().add(noEJB);

        authorRespository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(publisher);

        System.out.println("Started in Springboot");
        System.out.println("The total of books = "+bookRepository.count());
        System.out.println("the publisher " +publisher.getName()+ " has "+ publisher.getBooks().size()+ " books");




    }
}

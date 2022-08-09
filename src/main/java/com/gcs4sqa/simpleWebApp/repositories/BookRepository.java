package com.gcs4sqa.simpleWebApp.repositories;

import com.gcs4sqa.simpleWebApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}

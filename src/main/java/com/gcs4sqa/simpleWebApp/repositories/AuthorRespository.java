package com.gcs4sqa.simpleWebApp.repositories;

import com.gcs4sqa.simpleWebApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRespository extends CrudRepository<Author, Long> {
}

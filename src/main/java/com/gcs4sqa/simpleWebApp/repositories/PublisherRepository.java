package com.gcs4sqa.simpleWebApp.repositories;

import com.gcs4sqa.simpleWebApp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

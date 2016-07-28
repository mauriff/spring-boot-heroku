package com.example;

import org.springframework.data.mongodb.core.MongoAdminOperations;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by mauriff on 28/07/16.
 */
public interface BirraRepository extends MongoRepository<Birra, String> {
}

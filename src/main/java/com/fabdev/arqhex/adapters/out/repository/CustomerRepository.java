package com.fabdev.arqhex.adapters.out.repository;

import com.fabdev.arqhex.adapters.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}

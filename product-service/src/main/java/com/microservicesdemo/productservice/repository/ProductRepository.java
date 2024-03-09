package com.microservicesdemo.productservice.repository;

import com.microservicesdemo.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
//Generic Agr -> Product, Id Arg -> Sting
}

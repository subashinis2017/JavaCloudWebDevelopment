package com.javawebdev.dogmicroservice.repository;

import com.javawebdev.dogmicroservice.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}
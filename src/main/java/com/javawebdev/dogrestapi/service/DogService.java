package com.javawebdev.dogrestapi.service;

import com.javawebdev.bootstrap.entity.Location;
import com.javawebdev.dogrestapi.entity.Dog;

import java.util.List;

public interface DogService {
    List<Dog> retrieveDogs();
    List<String> retrieveDogBreed();
    String retrieveDogBreedById(Long id);
    List<String> retrieveDogNames();
}

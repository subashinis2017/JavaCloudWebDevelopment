package com.javawebdev.dogrestapi.service;

import com.javawebdev.bootstrap.entity.Location;
import com.javawebdev.bootstrap.repository.LocationRepository;
import com.javawebdev.bootstrap.service.LocationService;
import com.javawebdev.dogrestapi.entity.Dog;
import com.javawebdev.dogrestapi.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

import java.util.List;

@Service
public class DogServiceImpl implements DogService {
    @Autowired
    DogRepository dogRepository;

    public List<Dog> retrieveDogs() {
        return (List<Dog>) dogRepository.findAll();
    }

    public List<String> retrieveDogBreed() {
        return (List<String>) dogRepository.findAllBreed();
    }

    public String retrieveDogBreedById(Long id) {
        return (String) dogRepository.findBreedById(id);
    }

    public List<String> retrieveDogNames() {
        return (List<String>) dogRepository.findAllName();
    }
}

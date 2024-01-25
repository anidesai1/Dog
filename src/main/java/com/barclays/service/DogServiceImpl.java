package com.barclays.service;

import com.barclays.model.Dog;
import com.barclays.repository.DogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServiceImpl implements DogService {

    private final DogRepository dogRepository;

    public DogServiceImpl(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @Override
    public Dog save(Dog dog) {
        return dogRepository.save(dog);
    }

    @Override
    public Dog updateDog(Dog dog) {
        return dogRepository.save(dog);
    }

    @Override
    public List<Dog> findDogByName(String name) {
        return dogRepository.findDogByName(name);
    }

    @Override
    public List<Dog> findAll() {
        return dogRepository.findAll();
    }
}

package com.barclays.service;
import com.barclays.model.Dog;
import com.barclays.repository.DogRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class DogServiceImpl implements DogService{

    private DogRepository dogRepository;

    @Override
    @Transactional
    public Dog save(Dog dog) {
        return dogRepository.save(dog);
    }

    @Override
    public List<Dog> findAll() {
        List<Dog> dogs = new ArrayList<>();
        Iterable<Dog> dogsIts = dogRepository.findAll();
        dogsIts.forEach(dogs::add);
        return dogs;
    }

    @Override
    public List<Dog> findDogByName(String name) {
        return (List<Dog>) dogRepository.findDogByName(name);
    }
}

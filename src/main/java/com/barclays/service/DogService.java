package com.barclays.service;
import com.barclays.model.Dog;

import java.util.List;

public interface DogService {
    Dog save(Dog dog);
    List<Dog> findAll();
    List<Dog> findDogByName(String name);
}

package com.barclays.repository;

import com.barclays.model.Dog;

public interface DogRepository {

    Dog save(Dog dog);
    Dog updateDog(Dog dog);
    Dog findDogByName(String name);
}

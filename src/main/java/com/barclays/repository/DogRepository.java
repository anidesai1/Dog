package com.barclays.repository;
import com.barclays.model.Dog;
import java.util.List;

public interface DogRepository {

    Dog save(Dog dog);
    Dog updateDog(Dog dog);
    Dog findDogByName(String name);
    List<Dog> findAll();
}

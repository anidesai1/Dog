package com.barclays.repository;
import com.barclays.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DogRepository extends JpaRepository<Dog, Long> {
    @Query("SELECT d FROM Dog d WHERE d.dog_name = :name")
    List<Dog> findDogByName(@Param("name") String name);
    Dog save(Dog dog);
    List<Dog> findAll();
}

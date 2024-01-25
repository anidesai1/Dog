package com.barclays.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import lombok.Data;

@Entity
@Data
@NamedQuery(
        name = "Dog.findByName",
        query = "SELECT d FROM Dog d WHERE d.dog_name = :name"
)
public class Dog {
    @Id
    @GeneratedValue
    private long id;
    private String dog_name;
    private String breed;
    private int weight;
}
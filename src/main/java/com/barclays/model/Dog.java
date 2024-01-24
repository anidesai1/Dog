package com.barclays.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Dog {
    @Id
    @GeneratedValue
    private long id;
    private String dog_name;
    private String breed;
    private int weight;
}
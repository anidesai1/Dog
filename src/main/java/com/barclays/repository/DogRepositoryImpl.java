package com.barclays.repository;
import com.barclays.model.Dog;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class DogRepositoryImpl implements  DogRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Dog save(Dog dog) {
        entityManager.persist(dog);
        return dog;
    }

    @Override
    public Dog updateDog(Dog dog) {
        return entityManager.merge(dog);
    }

    @Override
    public Dog findDogByName(String name) {
        return entityManager.createQuery("SELECT d FROM Dog d WHERE d.name = :name", Dog.class)
                .setParameter("name", name) //jpa
                .getSingleResult();
    }

    @Override
    public List<Dog> findAll() {
        String jpql = "SELECT d FROM Dog d";
        TypedQuery<Dog> query = entityManager.createQuery(jpql, Dog.class);
        return query.getResultList();
    }
}

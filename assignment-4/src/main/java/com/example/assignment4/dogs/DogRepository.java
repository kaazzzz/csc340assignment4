package com.example.assignment4.dogs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Provides the actual database transactions for the Dog entity.
 */
@Repository
public interface DogRepository extends JpaRepository<Dog, Integer> {

    /**
     * Find all dogs by their breed.
     *
     * @param breed the breed of the dog.
     * @return a list of matching Dog objects.
     */
    List<Dog> getDogsByBreed(String breed);

    /**
     * Find all dogs whose name contains a given string.
     *
     * @param name the search key for dog names.
     * @return a list of matching Dog objects.
     */
    @Query(value = "SELECT * FROM dogs d WHERE d.name LIKE %?1%", nativeQuery = true)
    List<Dog> getDogsByName(String name);
}


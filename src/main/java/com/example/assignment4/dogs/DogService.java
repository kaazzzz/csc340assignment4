package com.example.assignment4.dogs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * DogService.java
 * Centralizes data access to the Dog Database.
 */
@Service
public class DogService {

    @Autowired
    private DogRepository dogRepository;

    /**
     * Fetch all Dogs.
     *
     * @return the list of all Dogs.
     */
    public List<Dog> getAllDogs() {
        return dogRepository.findAll();
    }

    /**
     * Fetch a unique Dog.
     *
     * @param dogId the unique Dog id.
     * @return a unique Dog object.
     */
    public Dog getDogById(int dogId) {
        return dogRepository.findById(dogId).orElse(null);
    }

    /**
     * Fetch all Dogs of a given breed.
     *
     * @param breed the search key.
     * @return the list of matching Dogs.
     */
    public List<Dog> getDogsByBreed(String breed) {
        return dogRepository.getDogsByBreed(breed);
    }

    /**
     * Fetch all Dogs with a name that contains the given string.
     *
     * @param name the search name.
     * @return the list of matching Dogs.
     */
    public List<Dog> getDogsByName(String name) {
        return dogRepository.getDogsByName(name);
    }

    /**
     * Add a new Dog to the database.
     *
     * @param dog the new Dog to add.
     */
    public void addNewDog(Dog dog) {
        dogRepository.save(dog);
    }

    /**
     * Update an existing Dog.
     *
     * @param dogId the unique Dog Id.
     * @param dog   the new Dog details.
     */
    public void updateDog(int dogId, Dog dog) {
        Dog existing = getDogById(dogId);
        if (existing != null) {
            existing.setName(dog.getName());
            existing.setDescription(dog.getDescription());
            existing.setBreed(dog.getBreed());
            existing.setAge(dog.getAge());

            dogRepository.save(existing);
        }
    }

    /**
     * Delete a unique Dog.
     *
     * @param dogId the unique Dog Id.
     */
    public void deleteDogById(int dogId) {
        dogRepository.deleteById(dogId);
    }
}

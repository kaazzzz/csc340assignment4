package com.example.assignment4.dogs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * DogController.java.
 * Includes all REST API endpoint mappings for the Dog object.
 */
@RestController
@RequestMapping("/dogs")
public class DogController {

    @Autowired
    private DogService service;

    /**
     * Get a list of all Dogs in the database.
     * http://localhost:8080/dogs/all
     *
     * @return a list of Dog objects.
     */
    @GetMapping("/all")
    public ResponseEntity<List<Dog>> getAllDogs() {
        return new ResponseEntity<>(service.getAllDogs(), HttpStatus.OK);
    }

    /**
     * Get a specific Dog by Id.
     * http://localhost:8080/dogs/{dogId}
     *
     * @param dogId the unique Id for a Dog.
     * @return One Dog object.
     */
    @GetMapping("/{dogId}")
    public ResponseEntity<Dog> getDogById(@PathVariable int dogId) {
        return new ResponseEntity<>(service.getDogById(dogId), HttpStatus.OK);
    }

    /**
     * Get all dogs of a given breed.
     * http://localhost:8080/dogs/breed/{breed}
     *
     * @param breed the breed of the Dog.
     * @return a list of Dog objects matching the breed.
     */
    @GetMapping("/breed/{breed}")
    public ResponseEntity<List<Dog>> getDogsByBreed(@PathVariable String breed) {
        return new ResponseEntity<>(service.getDogsByBreed(breed), HttpStatus.OK);
    }

    /**
     * Get animals whose name contains a string.
     * http://localhost:8080/dogs/name?search={substring}
     *
     * @param search the search string for dog names.
     * @return a list of Dog objects whose names contain the given string.
     */
    @GetMapping("/name")
    public ResponseEntity<List<Dog>> getDogsByName(@RequestParam(name = "search", defaultValue = "") String search) {
        return new ResponseEntity<>(service.getDogsByName(search), HttpStatus.OK);
    }

    /**
     * Add a new Dog entry.
     * http://localhost:8080/dogs/new
     *
     * @param dog the new Dog object.
     * @return the updated list of Dogs.
     */
    @PostMapping("/new")
    public ResponseEntity<List<Dog>> addNewDog(@RequestBody Dog dog) {
        service.addNewDog(dog);
        return new ResponseEntity<>(service.getAllDogs(), HttpStatus.CREATED);
    }

    /**
     * Update an existing Dog object.
     * http://localhost:8080/dogs/update/{dogId}
     *
     * @param dogId the unique Dog Id.
     * @param dog   the new updated Dog details.
     * @return the updated Dog object.
     */
    @PutMapping("/update/{dogId}")
    public ResponseEntity<Dog> updateDog(@PathVariable int dogId, @RequestBody Dog dog) {
        service.updateDog(dogId, dog);
        return new ResponseEntity<>(service.getDogById(dogId), HttpStatus.OK);
    }

    /**
     * Delete a Dog object.
     * http://localhost:8080/dogs/delete/{dogId}
     *
     * @param dogId the unique Dog Id.
     * @return the updated list of Dogs.
     */
    @DeleteMapping("/delete/{dogId}")
    public ResponseEntity<List<Dog>> deleteDogById(@PathVariable int dogId) {
        service.deleteDogById(dogId);
        return new ResponseEntity<>(service.getAllDogs(), HttpStatus.OK);
    }
}


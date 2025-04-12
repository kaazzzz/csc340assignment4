package com.example.assignment4.dogs;

import jakarta.persistence.*;

@Entity
@Table(name = "dogs")
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dogId;

    @Column(nullable = false)
    private String name;

    private String description;

    @Column(nullable = false)
    private String breed;

    @Column(nullable = false)
    private double age;

    public Dog(int dogId, String name, String description, String breed, double age) {
        this.dogId = dogId;
        this.name = name;
        this.description = description;
        this.breed = breed;
        this.age = age;
    }

    public Dog(String name, String description, String breed, double age) {
        this.name = name;
        this.description = description;
        this.breed = breed;
        this.age = age;
    }

    // Always include a no-argument constructor.
    public Dog() {
    }

    public int getDogId() {
        return dogId;
    }

    public void setDogId(int dogId) {
        this.dogId = dogId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
}

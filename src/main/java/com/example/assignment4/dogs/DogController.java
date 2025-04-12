package com.example.assignment4.dogs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/dogs")
public class DogController {

    @Autowired
    private DogService service;

    //  View all dogs
    @GetMapping("/all")
    public String getAllDogs(Model model) {
        List<Dog> dogs = service.getAllDogs();
        model.addAttribute("dogs", dogs);
        model.addAttribute("title", "All Dogs");
        return "animal-list";
    }

    //  View a single dog by ID
    @GetMapping("/{dogId}")
    public String getDogById(@PathVariable int dogId, Model model) {
        Dog dog = service.getDogById(dogId);
        model.addAttribute("dog", dog);
        model.addAttribute("title", "Dog Details");
        return "animal-details";
    }

    //  Search dogs by name
    @GetMapping("/name")
    public String getDogsByName(@RequestParam(name = "search", defaultValue = "") String search, Model model) {
        List<Dog> dogs = service.getDogsByName(search);
        model.addAttribute("dogs", dogs);
        model.addAttribute("title", "Search Results");
        return "animal-list";
    }

    //  Filter dogs by breed
    @GetMapping("/breed/{breed}")
    public String getDogsByBreed(@PathVariable String breed, Model model) {
        List<Dog> dogs = service.getDogsByBreed(breed);
        model.addAttribute("dogs", dogs);
        model.addAttribute("title", "Breed: " + breed);
        return "animal-list";
    }

    //  Show Create Dog form
    @GetMapping("/create-form")
    public String showCreateForm(Model model) {
        model.addAttribute("dog", new Dog());
        model.addAttribute("title", "Create New Dog");
        return "animal-create";
    }

    //  Handle Create Dog form
    @PostMapping("/create-form")
    public String handleCreateForm(@ModelAttribute Dog dog) {
        service.addNewDog(dog);
        return "redirect:/dogs/all";
    }

    //  Show Update Dog form
    @GetMapping("/update-form/{dogId}")
    public String showUpdateForm(@PathVariable int dogId, Model model) {
        Dog dog = service.getDogById(dogId);
        model.addAttribute("dog", dog);
        model.addAttribute("title", "Update Dog");
        return "animal-update";
    }

    //  Handle Update Dog form
    @PostMapping("/update-form/{dogId}")
    public String handleUpdateForm(@PathVariable int dogId, @ModelAttribute Dog dog) {
        service.updateDog(dogId, dog);
        return "redirect:/dogs/" + dogId;
    }

    //  Handle Delete using GET
    @GetMapping("/delete/{dogId}")
    public String deleteDog(@PathVariable int dogId) {
        service.deleteDogById(dogId);
        return "redirect:/dogs/all";
    }
}

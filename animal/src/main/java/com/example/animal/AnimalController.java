package com.example.animal;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AnimalController {
    @Autowired
    AnimalRepository repository;

    ArrayList<String> animals = new ArrayList<>();

    @GetMapping("/animals")
    public ResponseEntity<List<Animal>> getAnimals(){
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }
//    @GetMapping("/animals")
//    public List<String> getAnimals(){
//        return animals;
//    }
    @PostMapping("/animal")
    public ResponseEntity<String> createAnimal(@RequestBody Animal animal){
        repository.save(animal);
        return ResponseEntity.status(HttpStatus.CREATED).body("Animal information added");
    }


}



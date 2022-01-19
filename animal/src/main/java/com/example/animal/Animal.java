package com.example.animal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String animal;
    private String price;
    private String produce;

    public Animal(){

    }

    public Animal(String animal, String price, String produce) {
        this.animal = animal;
        this.price = price;
        this.produce = produce;
    }

    public int getId() {
        return id;
    }

    public String getAnimal() {
        return animal;
    }

    public String getPrice() {
        return price;
    }

    public String getProduce() {
        return produce;
    }
}

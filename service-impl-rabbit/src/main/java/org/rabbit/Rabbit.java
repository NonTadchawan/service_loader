package org.rabbit;

import org.example.api.pet.Pet;

public class Rabbit implements Pet {
    @Override
    public void eat() {
        System.out.println("Rabbit eat....");
    }
}

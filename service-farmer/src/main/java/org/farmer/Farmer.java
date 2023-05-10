package org.farmer;

import org.example.api.pet.Pet;

import java.util.Optional;
import java.util.ServiceLoader;

public class Farmer {
    public Pet breedPet(){
        ServiceLoader<Pet> service = ServiceLoader.load(Pet.class);
        Optional<Pet> first = service.findFirst();
        return first.get();
    }
}

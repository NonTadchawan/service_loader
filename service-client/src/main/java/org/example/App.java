package org.example;

import org.example.api.pet.Pet;
import org.farmer.Farmer;

public class App
{
    public static void main( String[] args )
    {
        Farmer fm = new Farmer();
        Pet pet = fm.breedPet();
        pet.eat();
    }
}

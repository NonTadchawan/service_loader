package org.cat;
import org.example.api.pet.Pet;
public class Cat implements Pet{
    @Override
    public void eat() {
        System.out.println("Cat eat....");
    }
}

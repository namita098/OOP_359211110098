package ooplap8;

import ooplap8.Pet;

public class Dog extends Pet {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Box Box !!!");
    }
}//class

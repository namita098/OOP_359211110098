package ooplab8;

import ooplab9.cow;

public class PetApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Chayen", 2);
        System.out.println(dog.toString());
        dog.makeNoise();
        System.out.println(dog.msg);
        cow cow = new cow("Namjai",5);
        //System.out.println(cow.msg);

    }
}
package ooplap8;

import ooplap9.Cow;

public class PetApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Chayen", 2);
        System.out.println(dog.toString());
        dog.makeNoise();
        System.out.println(dog.msg);
        Cow cow = new Cow("Namjai",5);
        //System.out.println(cow.msg);

    }
}
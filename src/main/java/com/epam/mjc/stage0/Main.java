package com.epam.mjc.stage0;

public class Main {
    public static void main(String[] args) {
        Animal sin = new Bird();
        Animal shar = new Dog();
        Animal animal = new Animal("lol", 1, true);
        System.out.println(sin.getDescription());
        System.out.println(shar.getDescription());
        System.out.println(animal.getDescription());
    }
}

package com.pack;

public class Animal {
    String name;
    boolean gender;
    int age;

    void printName()
    {
        System.out.println("Name is " +this.getClass().getSimpleName());
    }

    void eat()
    {
        System.out.println("Can eat Many things");
    }
}

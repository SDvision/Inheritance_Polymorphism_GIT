package com.pack;

public class Dog extends Animal
{
    int tail_length;

    @Override
    void printName()
    {
        System.out.println("Name is " +this.getClass().getSimpleName());
    }
    @Override
    void eat()
    {
        System.out.println("" +this.getClass().getSimpleName() +" Eats Non-Veg may be.");
    }
}

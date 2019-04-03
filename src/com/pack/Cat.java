package com.pack;

public class Cat extends Animal {

    int whisper_length;
    String sound;

    @Override
    void printName()
    {
        System.out.println("Name is " + this.getClass().getSimpleName());
        //super.printName();
    }
}

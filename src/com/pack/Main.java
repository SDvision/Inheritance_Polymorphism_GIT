package com.pack;

public class Main {

    public static void main(String[] args)
    {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Animal[] animal_array = new Animal[3];

        System.out.println("----------------FOR ANIMAL -----------------");
        animal.printName();
        animal.eat();

        System.out.println("-------------------FOR CAT -----------------");
        cat.printName();
        cat.eat();

        System.out.println("--------------------FOR DOG -----------------");
        dog.printName();
        dog.eat();

        System.out.println("---------------------FOR ANIMAL ARRAY -----------------");
        animal_array[0] = animal;
        animal_array[1] = cat;
        animal_array[2] = dog;

        for(Animal a:animal_array)
        {
            a.printName();
        }

        System.out.println("--------------------GENERAL ANALYSIS-------------------");
        Animal a_cat = new Cat();
        a_cat.printName();

        Animal a_dog = new Dog();
        a_dog.printName();
    }
}

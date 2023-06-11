package ru.geekbrains.lesson3.task1;

public class Cat extends Animal {

    private static int counter;

    public static int getCounter() {
        return counter;
    }

    {
        System.out.println("Initializer Cat");
        counter++;
    }

    public Cat(String name) {
        super(name, 0, 200);
    }

    @Override
    void swim(int distance) {
        System.out.println(name + " не умеет плавать!");
    }


}

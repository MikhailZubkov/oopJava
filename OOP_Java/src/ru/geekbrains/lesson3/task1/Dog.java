package ru.geekbrains.lesson3.task1;

public class Dog extends Animal{

    private static int counter;

    public static int getCounter() {
        return counter;
    }

    {
        System.out.println("Initializer Dog");
        counter++;
    }

    public Dog(String name) {
        super(name, 10, 500);
    }

    @Override
    void run(int distance) {
        super.run(distance);
    }
}

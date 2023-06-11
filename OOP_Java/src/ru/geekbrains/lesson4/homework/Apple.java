package ru.geekbrains.lesson4.homework;

public class Apple extends Fruit{
    private static int count;
    private int id;

    {
        id = ++count;
    }
    public Apple() {
        super(1.0f);
    }

    @Override
    public String toString() {
        return "Яблоко" + id;
    }
}

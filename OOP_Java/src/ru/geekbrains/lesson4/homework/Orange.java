package ru.geekbrains.lesson4.homework;

public class Orange extends Fruit{
    public Orange() {
        super(1.5f);
    }

    private static int count;
    private int id;

    {
        id = ++count;
    }

    @Override
    public String toString() {
        return "Апельсин" + id;
    }

}

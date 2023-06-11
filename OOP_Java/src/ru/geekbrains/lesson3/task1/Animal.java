package ru.geekbrains.lesson3.task1;

import java.util.Random;

public abstract class Animal {

    protected String name;
    protected int maxSwim;
    protected int maxRun;

    private int id;

    private static Random random = new Random();
    private static int identifier;
    private static int counter;

    public static int getCounter() {
        return counter;
    }

    public static int getIdentifier() {
        return identifier;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public int getMaxRun() {
        return maxRun;
    }

    static {
        System.out.println("Static Initializer");
        if (random.nextInt(2) == 0){
            identifier = 1000;
        }
        else
        {
            identifier = 2000;
        }
    }

    {
        System.out.println("Initializer");

        id = ++identifier;
        counter++;
    }

    public Animal(){
        System.out.println("Constructor");

    }

    public Animal(String name)
    {
        System.out.println("Constructor");
        this.name = name;
    }

    public Animal(String name, int maxSwim, int maxRun) {
        System.out.println("Constructor");
        this.name = name;
        this.maxSwim = maxSwim;
        this.maxRun = maxRun;
    }

    void run(int distance) {
        if (distance <= maxRun) {
            System.out.printf("%s пробежал %d метров\n", name, distance);
        } else System.out.printf("%s не смог пробежать %d метров\n", name, distance);
    }

    void swim(int distance) {
        if (distance <= maxSwim) {
            System.out.printf("%s проплыл %d метров\n", name, distance);
        } else System.out.printf("%s не смог проплыть %d метров\n", name, distance);
    }


}

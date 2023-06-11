package ru.geekbrains.lesson2.Sample2;

public class Cat extends Animal implements Runner {

    private final String name;
    private final int maxRun;
    private final int maxJump;

    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public Cat(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }


}

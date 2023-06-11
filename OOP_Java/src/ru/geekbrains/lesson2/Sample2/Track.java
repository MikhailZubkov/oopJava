package ru.geekbrains.lesson2.Sample2;

public class Track implements Obstacle{

    private final int length;

    public Track(int length) {
        this.length = length;
        //super.length = 12;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getHeight() {
        return 0;
    }
}

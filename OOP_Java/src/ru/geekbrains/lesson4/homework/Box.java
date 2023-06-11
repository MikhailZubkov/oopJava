package ru.geekbrains.lesson4.homework;

import java.util.ArrayList;

public class Box <F extends Fruit> {

    private ArrayList<F> fruits;

    public Box(ArrayList<F> fruits) {
        this.fruits = fruits;
    }

    public void add (F e){
        this.fruits.add(e);
    }

    public double getWeightBox() {
        if (fruits.isEmpty()) return 0;
        return fruits.get(0).getWeight() * fruits.size();
    }

    @Override
    public String toString() {
        if (fruits.isEmpty()) return "Коробка пустая";
        String name = fruits.get(0).getClass().getSimpleName();
        return "Box{" + name +
                fruits +
                '}';
    }

    public boolean compare(Box box) {
        return this.getWeightBox() == box.getWeightBox();
    }

    public void moveFrom (int amount, Box <F> box) {
        if (amount <= box.fruits.size()) {
            for (int i = 0; i < amount; i++) {
                this.add(box.fruits.remove(0));
            }
        }
    }

}

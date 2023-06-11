package ru.geekbrains.lesson4.homework;

import java.util.ArrayList;
import java.util.List;

public class Program {

    /**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Box <Apple> appleBox = new Box<>(new ArrayList<>());
        appleBox.add(apple1);
        appleBox.add(apple2);
        Box <Apple> appleBox2 = new Box<>(new ArrayList<>());
        appleBox2.add(apple3);

//        appleBox.add(orange1); //не позволяет добавить
        System.out.println(appleBox);
        System.out.println(appleBox.getWeightBox() + "кг");

        Box <Orange> orangeBox = new Box<>(new ArrayList<>(List.of(orange1, orange2)));
        System.out.println(orangeBox);
        System.out.println(orangeBox.getWeightBox() + "кг");

        System.out.println(appleBox.compare(orangeBox));

        appleBox2.moveFrom(2, appleBox);
        System.out.println(appleBox);
        System.out.println(appleBox2);

    }



}

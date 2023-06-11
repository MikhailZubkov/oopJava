package ru.geekbrains.lesson3.task1;

/**
 *     Создать классы Собака и Кот с наследованием от класса Животное.
 *     Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
 *     Результатом выполнения действия будет печать в консоль. (Например, dog1.run(150); -> 'Бобик пробежал 150 м.');
 *     У каждого животного есть ограничения на действия
 *     (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
 *     Добавить подсчет созданных котов, собак и животных.
 */
public class Program {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");
        System.out.println(cat1.getId());
        cat1.run(10);

        Cat cat2 = new Cat("Персик");
        cat2.swim(20);
        System.out.println(cat2.getId());

        Cat cat3 = new Cat("Бублик");
        cat2.run(300);
        System.out.println(cat3.getId());

        Dog dog1 = new Dog("Шарик");
        System.out.println(dog1.getId());

        Dog dog2 = new Dog("Шарик");
        System.out.println(dog2.getId());

        System.out.printf("Было создано %d котов.\n", Cat.getCounter());
        System.out.printf("Было создано %d собак.\n", Dog.getCounter());
        System.out.printf("Было создано %d животных.\n", Animal.getCounter());



    }

}

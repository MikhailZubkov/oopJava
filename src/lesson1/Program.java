package lesson1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        // Создаем продукт при помощи первого контсруктора
        Product product1 = new Product();
        System.out.println(product1.displayInfo());
        // Создаем продукт при помощи второго конструктора
        Product product2 = new Product("Бутылка колы", 55);
        System.out.println(product2.displayInfo());
        // Создаем продукт при помощи третьего конструктора
        Product product3 = new Product("ООО Чистый Источник", "Бутылка воды", -90.15);
        System.out.println(product3.displayInfo());

        // создать новую переменную класса бутылка воды
        BottleOfWater bottleOfWater1 = new BottleOfWater("ООО Чистый Источник", "Бутылка с водой #3", -90.15, 1.5);
        System.out.println(bottleOfWater1.displayInfo());
        // создать новую переменную класса бутылка воды
        Product bottleOfMilk = new BottleOfMilk("ООО Чистый Источник", "Бутылка с молоком #1", -90.15, 1.5, 10);
        System.out.println(bottleOfMilk.displayInfo());
        // создаем список для всех продуктов
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(bottleOfWater1);
        products.add(bottleOfMilk);

        // импортируем список продуктов в метод Vending machine
        VendingMachine vendingMachine = new VendingMachine(products);
        // Создаем переменную для искомой бутылки воды и ищем
        BottleOfWater bottleOfWaterResult = vendingMachine.getBottleOfWater(1.5);
        if (bottleOfWaterResult != null) {
            System.out.println("Вы купили:");
            System.out.println(bottleOfWaterResult.displayInfo());
        } else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }

        // создаем продукты объекты типа шоколад и добавлеем их в список продуктов
        Chocolate chocolate1 = new Chocolate("Ritter Sport", "Extra Cocoa", 150, 250, "Темный");
        Chocolate chocolate2 = new Chocolate("Mondelez", "Alpen Gold", 110, 450, "Молочный");
        products.add(chocolate1);
        products.add(chocolate2);

        // создаем переменную для искомой шоколадки и ищем
        Chocolate chocolateResult = vendingMachine.getChocolate("Темный");
        if (chocolateResult != null) {
            System.out.println("Вы купили: ");
            System.out.println(chocolateResult.displayInfo());
        } else {
            System.out.println("Такого шоколада нет в автомате");
        }

    }

}
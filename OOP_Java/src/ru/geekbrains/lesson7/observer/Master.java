package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Master implements Observer {

    private static Random random = new Random();

    private String name;
    private TypeVacancy typeVacancy;
    private double minSalary;

    public Master(String name, TypeVacancy typeVacancy) {
        this.name = name;
        this.typeVacancy = typeVacancy;
        minSalary = random.nextDouble(80000, 100000);
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if (typeVacancy == vacancy.getTypeVacancy()) {
            if (minSalary <= vacancy.getSalary()) {
                System.out.printf("Мастер %s (%.2f) >>> Мне нужна эта работа! (%s %s - %.2f)\n",
                        name, minSalary, nameCompany, vacancy.getNameVacancy(), vacancy.getSalary());
                minSalary = vacancy.getSalary();
            }
            else {
                System.out.printf("Мастер %s (%.2f) >>> Я найду работу получше! (%s %s - %.2f)\n",
                        name, minSalary, nameCompany, vacancy.getNameVacancy(), vacancy.getSalary());
            }
        }
        else {
            System.out.printf("Мастер %s %s (%.2f) >>> Мне не подходит вакансия %s от компании %s\n",
                    name, typeVacancy, minSalary, vacancy.getNameVacancy(), nameCompany);
        }
    }

}

package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Ingeneer implements Observer {

    private static Random random = new Random();

    private String name;
    private double minSalary;
    private TypeVacancy typeVacancy;


    public Ingeneer(String name, TypeVacancy typeVacancy) {
        this.name = name;
        this.typeVacancy = typeVacancy;
        minSalary = random.nextDouble(50000, 80000);
    }


    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if (typeVacancy == vacancy.getTypeVacancy()) {
            if (minSalary <= vacancy.getSalary()) {
                System.out.printf("Инженер %s (%.2f) >>> Мне нужна эта работа! (%s %s - %.2f)\n",
                        name, minSalary, nameCompany, vacancy.getNameVacancy(), vacancy.getSalary());
                minSalary = vacancy.getSalary();
            }
            else {
                System.out.printf("Инженер %s (%.2f) >>> Я найду работу получше! (%s %s - %.2f)\n",
                        name, minSalary, nameCompany, vacancy.getNameVacancy(), vacancy.getSalary());
            }
        }
        else {
            System.out.printf("Инженер %s %s (%.2f) >>> Мне не подходит вакансия %s от компании %s\n",
                    name, typeVacancy, minSalary, vacancy.getNameVacancy(), nameCompany);
        }
    }
    
}

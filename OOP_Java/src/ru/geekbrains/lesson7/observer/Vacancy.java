package ru.geekbrains.lesson7.observer;

public class Vacancy {

    private String nameVacancy;
    private double salary;

    TypeVacancy typeVacancy;

    public Vacancy(String nameVacancy, double salary, TypeVacancy typeVacancy) {
        this.nameVacancy = nameVacancy;
        this.salary = salary;
        this.typeVacancy = typeVacancy;       
    }

    public String getNameVacancy() {
        return nameVacancy;
    }

    public double getSalary() {
        return salary;
    }

    public TypeVacancy getTypeVacancy() {
        return typeVacancy;
    }
    
    
    

}

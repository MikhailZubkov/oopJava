package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Company {

    private String nameCompany;

    private Publisher jobAgency;

    public Company(String nameCompany, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.jobAgency = jobAgency;
    }

    // private Vacancy vacancy;

    public void needEmployee(Vacancy vacancy){
        jobAgency.sendOffer(nameCompany, vacancy);
    }

}

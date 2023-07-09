package ru.geekbrains.lesson7.observer;

public class Program {


    /**
     * TODO: 1.Доработать приложение, поработать с шаблоном проектирования Observer
     *   добавить новый тип соискателя.
     *   **.2 Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *   **.3 Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();
        Vacancy programmerJava = new Vacancy("Программист Java", 80000, TypeVacancy.Программист);
        Vacancy cleaner = new Vacancy("Уборщик", 5000, TypeVacancy.Уборщик);
        Vacancy analyst = new Vacancy("Аналитик БД", 70000, TypeVacancy.Аналитик);
        Vacancy programmerJavaMidl = new Vacancy("Программист Java Midl", 100000, TypeVacancy.Программист);


        Company geekBrains = new Company("GeekBrains", jobAgency);
        Company google = new Company("Google", jobAgency);
        Company yandex = new Company("Yandex", jobAgency);

        Master ivanov = new Master("Ivanov", TypeVacancy.Аналитик);
        Master petrov = new Master("Petrov", TypeVacancy.Программист);
        Student sidorov = new Student("Sidorov");
        Ingeneer mask = new Ingeneer("Mask", TypeVacancy.Программист);

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(mask);


        yandex.needEmployee(cleaner);
        geekBrains.needEmployee(programmerJava);
        google.needEmployee(programmerJavaMidl);
        yandex.needEmployee(analyst);

    }

}

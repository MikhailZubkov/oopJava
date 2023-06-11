package DZ.task2;

/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего
 * задания.
 * *20*8
 */
public class Freelancer extends Employee {

    private double rate;
    private int hours;

    public Freelancer(String name, String surname, double rate, int hours, int age) {
        super(name, surname, rate * (double) hours, age);
        this.rate = rate;
        this.hours = hours;
    }

    @Override
    public double calculateSalary() {
        return this.rate * (double) this.hours;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Возраст: %d; ЗП (ставка %.2f, часы %d): %.2f (руб.)",
                surname, name, age, rate, hours, calculateSalary());
    }

}

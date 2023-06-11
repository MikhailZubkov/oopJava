package ru.geekbrains.lesson4.bank;

public class Program {

    public static void main(String[] args) {

        DebetAccount<Entity> entityDebetAccount1 =
                new DebetAccount<>(new Entity("ООО Рога и копыта", "1111233"), 50000);

        CreditAccount<Person> personCreditAccount1 =
                new CreditAccount<>(new Person("Иванов А. С.", "1111234"), 12.01);

        Transaction<Account<?>> transaction = new Transaction<>(entityDebetAccount1, personCreditAccount1, 26000);
        transaction.execute();
        transaction.execute();
    }

}

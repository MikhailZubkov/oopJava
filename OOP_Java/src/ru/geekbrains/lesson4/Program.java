package ru.geekbrains.lesson4;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        SimpleAccount simpleAccount = new SimpleAccount(443334, 300.29);
        System.out.println(simpleAccount);

        UniversalAccount universalAccount1 = new UniversalAccount("AAAABB111", 40000.12);
        System.out.println(universalAccount1);

        UniversalAccount universalAccount2 = new UniversalAccount(new AccountIdentifier(554, "AAB1"), 40000.12);
        System.out.println(universalAccount2);

        System.out.println(((AccountIdentifier)universalAccount2.getId()).getPrefix());

        Account<AccountIdentifier> account1 = new Account<>(new AccountIdentifier(554, "AAB1"), 444.12);
        System.out.println(account1);
        AccountIdentifier accountIdentifier1 = account1.getId();
        System.out.println(accountIdentifier1.getPrefix());

        int a = 12;
        double b = 4.12;
        boolean  f = true;
        char c = 'f';

        Object[] elements = new Object[4];
        elements[0] = a;
        elements[1] = b;
        elements[2] = c;
        elements[3] = f;

        for (Object element: elements) {
            if (element instanceof Double){
                //((double)element)
            }
        }

        ArrayList<String> list = new ArrayList<>();

        Integer[] numbers = {2, 5, 6, -10, 4, 5, 1, 100};
        String[] names = {"Дарья", "Андрей", "Станислав", "Мария", "Сергей"};

        Object[] newNames = ArrayUtils.replaceTwoElements(names, 1, 3);

        for (Object element: newNames) {
            System.out.println(element);
        }

        String[] newNumbers = ArrayUtils.replaceTwoElementsV2(names, 1, 3);

    }

}

package DZ.task2;

import java.util.Comparator;

public class SurnameAgeComporator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int res = o1.getSurname().compareTo(o2.getSurname());
        if (res == 0) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        return res;
    }
}

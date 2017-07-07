package home_work02;

import home_work01.Employee;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Никита on 07.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Nikita", 20, 70000);
        Employee employee2 = new Employee("Maxim", 23, 50000);
        Employee employee3 = new Employee("Sergei", 19, 45000);
        Employee employee4 = new Employee("Vladislav", 21, 47000);
        Employee employee5 = new Employee("Bogdan", 24, 55000);
        Employee employee6 = new Employee("Boris", 27, 65000);
        Employee employee7 = new Employee("Yevhenii", 25, 80000);
        Employee employee8 = new Employee("Oleg", 30, 75000);
        Employee employee9 = new Employee("Victor", 26, 63000);
        Employee employee10 = new Employee("Semen", 22, 53000);

        List<Employee> list = new LinkedList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);
        list.add(employee6);
        list.add(employee7);

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            list.add(0, employee8);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);

    }
}

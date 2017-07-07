package home_work01;

import java.util.*;

import static java.util.Comparator.comparingInt;


/**
 * Created by Никита on 05.07.2017.
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

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);
        employees.add(employee9);
        employees.add(employee10);

        Collections.sort(employees, new Employee.AgeComparator());
        System.out.println(employees);

        Collections.sort(employees, comparingInt(o -> o.salary));
        System.out.println(employees);

        Iterator<Employee> iterator = employees.iterator();
        int averageSalary = getAverageSalary(employees.toArray(new Employee[]{}));
        while (iterator.hasNext()) {
            Employee next = iterator.next();
            if (next.salary > averageSalary) {
                System.out.println(next.name);
            }
        }
    }

    static int getAverageSalary(Employee... employees) {
        int total = 0;
        for (Employee employee : employees) {
            total += employee.salary;
        }
        return total / employees.length;
    }

    }




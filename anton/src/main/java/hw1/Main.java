package hw1;

import java.util.*;

import static java.util.Comparator.comparingInt;

/**
 * Created by User on 05.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("PetyaA", 40, 2000);
        Employee employee1 = new Employee("Sasha", 26, 1500);
        Employee employee2 = new Employee("Vanya", 22, 3000);
        Employee employee3 = new Employee("Vlad", 34, 4500);
        Employee employee4 = new Employee("Artem", 19, 1000);
        Employee employee5 = new Employee("Egor", 38, 6000);
        Employee employee6 = new Employee("Alexey", 45, 5500);
        Employee employee7 = new Employee("Oleg", 32, 3900);
        Employee employee8 = new Employee("Igor", 24, 2700);
        Employee employee9 = new Employee("Maxim", 50, 4300);
        Employee employee10 = new Employee("Sem", 50, 14300);

        List<Employee> arrays = Arrays.asList(employee1, employee2, employee3);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
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

        System.out.println(employees.toString());
        Collections.sort(employees);

        System.out.println(employees);

        Collections.sort(employees, new AgeComparator());
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

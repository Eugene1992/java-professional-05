package hw01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Ярик on 04.07.2017.
 */
public class Main {
    private static ArrayList<Employee> employees = new ArrayList<Employee>();
    private static int count;

    public static void main(String[] args) {
        employees.add(new Employee("Yen", 20, 1000));
        employees.add(new Employee("Helen", 19, 2000));
        employees.add(new Employee("Dom", 40, 10000));
        employees.add(new Employee("Dima", 18, 500));
        employees.add(new Employee("Andrew", 21, 1500));
        employees.add(new Employee("George", 23, 2500));
        employees.add(new Employee("Artur", 25, 300));
        employees.add(new Employee("Gregore", 22, 4000));
        employees.add(new Employee("Alex", 16, 1050));
        employees.add(new Employee("Elysa", 20, 2000));

        Iterator<Employee> iterator = employees.iterator();
        // mid salary
        while (iterator.hasNext()) {
            Employee next = iterator.next();
            count += next.getSalary();
        }
        count = count / 10;

        while (iterator.hasNext()) {
            Employee next = iterator.next();
            if(next.getSalary() > count){
                System.out.println(next.getName());
            }
        }

        for (Object o: employees) {
            System.out.println(o);
        }
    }
}





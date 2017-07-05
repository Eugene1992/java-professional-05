package Home_Work01;

import java.util.ArrayList;
import java.util.Iterator;


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

        ArrayList employees = new ArrayList();
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

        for (Object emp:employees) {


        }

        Iterator<Object> iterator = employees.iterator();
        int avg = 0;
        while (iterator.hasNext()) {
            Object obj = iterator.next();


            System.out.println(obj);
        }


    }
}


package hw1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by User on 05.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Petya",40,2000);
        Employee employee1 = new Employee("Sasha",26, 1500);
        Employee employee2 = new Employee("Vanya",22, 3000);
        Employee employee3 = new Employee("Vlad",34,4500);
        Employee employee4 = new Employee("Artem",19,1000);
        Employee employee5 = new Employee("Egor",38,6000);
        Employee employee6 = new Employee("Alexey",45,5500);
        Employee employee7 = new Employee("Oleg",32,3900);
        Employee employee8 = new Employee("Igor",24,2700);
        Employee employee9 = new Employee("Maxim",50,4300);


        ArrayList <Employee> employees = new ArrayList<Employee>();
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

        Collections.sort(employees);
        Collections.sort(employees,new AgeComporator());
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee next = iterator.next();
            int midsalary = (employee.salary+employee1.salary+employee2.salary+employee3.salary+employee4.salary+
                    employee5.salary+employee6.salary+employee7.salary+employee8.salary+employee9.salary) / 10;
            if (next.salary > midsalary) System.out.println(next.name);
        }








    }
}

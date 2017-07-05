package hw1;

import java.util.Comparator;

/**
 * Created by User on 05.07.2017.
 */
class Employee implements Comparable<Employee> {
    String name;
    int age;
    int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int compareTo(Employee emp) {
        /*if (this.salary < emp.salary) {
            return -1;
        } else if (this.salary > emp.salary) {
            return 1;
        }
        return 0;*/
        return this.salary - emp.salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}


class AgeComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {

        if (e1.age < e2.age) {
            return -1;
        } else if (e1.age > e2.age) {
            return 1;
        }
        return 0;
    }
}



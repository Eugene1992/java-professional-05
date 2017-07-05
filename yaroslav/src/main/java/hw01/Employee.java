package hw01;

import java.util.*;

public class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee e) {
        if(this.age > e.age) return 1;
        if(this.age < e.age) return -1;
        return 0;

    }

    @Override
    public String toString() {
        return "Employee {" + "salary" + salary + "}";
    }

}
    abstract class compareAge implements Comparator<Employee> {
        public int compareAge(Employee o1, Employee o2) {
        return o1.getAge() - o2.getAge();
    }
}

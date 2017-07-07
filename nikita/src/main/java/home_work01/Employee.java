package home_work01;

import java.util.Comparator;

/**
 * Created by Никита on 05.07.2017.
 */
public class Employee implements Comparable<Employee> {
    // TODO: 07.07.2017 where is our encapsulation???
    public String name;
    public int age;
    public int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        return this.salary - o.salary;
    }

    // TODO: 07.07.2017 move to separate class
    static class AgeComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.age - o2.age;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
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
}

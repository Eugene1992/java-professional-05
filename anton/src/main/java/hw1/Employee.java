package hw1;

import java.util.Comparator;

/**
 * Created by User on 05.07.2017.
 */
class Employee implements Comparable {
    String name;
    int age;
    int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    Employee(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;

    }
       public int compareTo(Object o) {
        Employee s = (Employee) o;
        if (this.salary < s.salary) {
            return -1;
        } else if (this.salary > s.salary){
            return 1;
        }
        return 0;
    }
    }


class AgeComporator implements Comparator {
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;


        if (e1.age < e2.age) {
            return -1;
        } else if (e1.age > e2.age) {
            return 1;
        }
        return 0;
    }
}



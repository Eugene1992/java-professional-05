package java_8;

import com.sun.java.swing.plaf.windows.WindowsTreeUI;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;

public class MainTest {

    private ArrayList<Employee> employees;

    @Before
    public void setUp() {
        employees = new ArrayList<>();
        employees.add(new Employee("Ivan Ivanov",   25, Gender.MALE,    15000,  true, asList(6, 12, 45)));
        employees.add(new Employee("Anna Karenina", 23, Gender.FEMALE,  25000,  false, asList(65, 11, 54)));
        employees.add(new Employee("Tom Crus",      18, Gender.MALE,    55000,  false, asList(16, 552, 42, 76)));
        employees.add(new Employee("Sara Barkley",  35, Gender.FEMALE,  7000,   true, asList(6, 12)));
        employees.add(new Employee("Bob Marley",    34, Gender.MALE,    33000,  false, singletonList(7)));
    }

    @Test
    public void filterTest() {

        Predicate<Employee> predicate = new Predicate<Employee>() {
            @Override
            public boolean test(Employee e) {
                return e.getGender() == Gender.FEMALE;
            }
        };

        OuterPredicate outerPredicate = new OuterPredicate();

        employees
                .stream()
                .filter(new Predicate<Employee>() {
                    @Override
                    public boolean test(Employee e) {
                        return e.getGender() == Gender.FEMALE;
                    }
                })
                .filter(e -> e.getGender() == Gender.FEMALE)
                .forEach(System.out::println);
    }

    @Test
    public void skipTest() {
        employees
                .stream()
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    public void mapTest() {
        employees
                .stream()
                .filter(e -> e.getGender() == Gender.MALE)
                .map(employee -> employee.getSalary())
                .forEach(x -> System.out.println(x));
    }

    @Test
    public void peekTest() {
        employees
                .stream()
                .peek(employee -> {
//                    System.out.println("!");
                    employee.setSalary(employee.getSalary() * 2);
                })
                .forEach(x -> System.out.println(x));
    }

    @Test
    public void sortedTest() {
        employees
                .stream()
                .sorted((o1, o2) -> o1.getSalary() - o2.getSalary())
                .limit(3)
//                .skip(3)
                .forEach(System.out::println);
    }

    @Test
    public void flatMapTest() {
        System.out.println(employees
                .stream()
                .flatMap(employee -> employee.getLuckyNums().stream())
                .max((o1, o2) -> o1 - o2)
                .get()
        );
    }

    @Test
    public void allMatchTest() {
        System.out.println(
                employees
                .stream()
//                .allMatch(employee -> employee.getSalary() > 1_000)
//                .anyMatch(employee -> employee.getSalary() > 100_000)
                .noneMatch(employee -> employee.getSalary() > 50_000)
        );
    }

    static List<Integer> indexSalary(List<Employee> employees) {
        List<Integer> salaries = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() > 40 && employee.isMarried) {
                salaries.add(employee.getSalary() * 2);
            }
        }
        return salaries;
    }

    static List<Integer> indexSalaryByStreamsApi(List<Employee> employees) {
        return employees
                .stream()
                .filter(e -> e.getAge() > 40 && e.isMarried)
                .map(e -> e.getSalary() * 2)
                .collect(Collectors.toList());
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class Employee {

        private String name;
        private int age;
        private Gender gender;
        private int salary;
        private boolean isMarried;
        private List<Integer> luckyNums;

    }

    enum Gender {
        MALE, FEMALE
    }

}

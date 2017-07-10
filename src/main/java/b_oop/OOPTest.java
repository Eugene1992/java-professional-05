package b_oop;

public class OOPTest {
    public static void main(String[] args) {
        Employee ivan = new Employee();
        ivan.salary = 12000;
        ivan.age = 21;
        ivan.name = "Ivan";

        Employee petr = new Employee();
        ivan.salary = 20000;
        ivan.age = 32;
        ivan.name = "Petr";

        Employee empMaxSalary = getEmpMaxSalary(new Employee[]{ivan, petr});
        System.out.println(empMaxSalary.name);
    }

    static Employee getEmpMaxSalary(Employee[] employees) {
        Employee max = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].salary > max.salary) {
                max = employees[i];
            }
        }
        return max;
    }
}

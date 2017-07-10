package b_oop;

public class NoOOPTest {
    public static void main(String[] args) {
        int[] salaries = {12000,  20000,  3000,    50000,  7000};
        int[] ages =     {21,     32,      43,     18};
        String[] names = {"Ivan", "Petr", "Anton", "Gleb", "Maksim"};
        System.out.println(getEmpMaxSalary(salaries, names));
    }

    static String getEmpMaxSalary(int[] salary, String[] name) {
        int max = salary[0];
        String maxName = name[0];
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] > max) {
                maxName = name[i];
            }
        }
        return maxName;
    }
}

package annotation;

import java.net.URLDecoder;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee();

        String firstName = employee.getFirstName();

        System.out.println(employee);

        URLDecoder.decode("");
    }
}

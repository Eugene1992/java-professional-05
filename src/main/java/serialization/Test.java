package serialization;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee ivan = new Employee("Ivan", 20, true);

        ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("data.txt")
        );

        outputStream.writeObject(ivan);

        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("data.txt")
        );

        Employee emp = (Employee) inputStream.readObject();

        System.out.println(emp.getName());
    }

    @Data
    @AllArgsConstructor
    static class Employee implements Serializable {
        private String name;
        private int age;
        private boolean isMarried;
    }

}

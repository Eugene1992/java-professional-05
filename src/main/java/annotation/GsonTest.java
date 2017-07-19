package annotation;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Nikita", "Chihaleychik", 22, 12500);
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        String json = gson.toJson(employee);
        System.out.println(json);
//        firstNameNikitalastNameChihaleychik
//        11110110101010101010110111010111101001011010101010111

    }
}

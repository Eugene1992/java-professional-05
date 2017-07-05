package array_list;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> elementData = new ArrayList<>(100);

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            elementData.add(0, "Hello");
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}

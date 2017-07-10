package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();

        strings.add("Hello");
        strings.add("Ankara");
        strings.add("Hello");

        System.out.println(strings);

        ArrayList<Object> arrayList = new ArrayList<>();
        Set<Object> objects = new HashSet<>(arrayList);

    }
}

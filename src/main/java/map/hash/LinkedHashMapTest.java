package map.hash;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {
    public static void main(String[] args) {

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(123, "One");
        linkedHashMap.put(1234, "Three");
        linkedHashMap.put(2323, "Two");
        linkedHashMap.put(124, "Four");

        System.out.println(linkedHashMap);
    }
}

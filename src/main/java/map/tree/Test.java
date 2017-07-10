package map.tree;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            treeMap.put(random.nextInt(100), "");
        }

        System.out.println(treeMap);

        TreeMap<Human, String> humanTreeMap = new TreeMap<>(
                new Comparator<Human>() {
                    @Override
                    public int compare(Human o1, Human o2) {
                        return o2.name.compareTo(o1.name);
                    }
                }
        );

        humanTreeMap.put(new Human("Eduard", 20), "");
        humanTreeMap.put(new Human("Yaroslav", 18), "");
        humanTreeMap.put(new Human("Anton", 21), "");

        System.out.println(humanTreeMap);
    }

    static class Human implements Comparable<Human>{
        String name;
        int age;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Human o) {
            return this.age - o.age;
        }

        @Override
        public String toString() {
            return "Human{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}

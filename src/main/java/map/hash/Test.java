package map.hash;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "One");
        map.put(1, "One*");
        map.put(2, "Two");
        map.put(3, "Two");

        System.out.println(map);

        String value = map.get(1);

        System.out.println(value);

        HashMap<Human, String> humanStringHashMap = new HashMap<>();

        Human yaroslav1 = new Human("Yaroslav", 1.80, 19, false);
        Human yaroslav2 = new Human("Yaroslav", 1.80, 19, false);

        System.out.println(yaroslav1.hashCode());
        System.out.println(yaroslav2.hashCode());

        humanStringHashMap.put(yaroslav1, "Value1");
        humanStringHashMap.put(yaroslav2, "Value2");

        yaroslav2 = new Human("Yaroslav", 1.80, 19, false);

        System.out.println(humanStringHashMap.get(yaroslav1));
        System.out.println(humanStringHashMap.get(yaroslav2));

    }

    static class Human {
        String name;
        double height;
        int age;
        boolean isMarried;

        public Human(String name, double height, int age, boolean isMarried) {
            this.name = name;
            this.height = height;
            this.age = age;
            this.isMarried = isMarried;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (Double.compare(human.height, height) != 0) return false;
            if (age != human.age) return false;
            if (isMarried != human.isMarried) return false;
            return name != null ? name.equals(human.name) : human.name == null;
        }

        @Override
        public int hashCode() {
            int result;
            long temp;
            result = name != null ? name.hashCode() : 0;
            temp = Double.doubleToLongBits(height);
            result = 31 * result + (int) (temp ^ (temp >>> 32));
            result = 31 * result + age;
            result = 31 * result + (isMarried ? 1 : 0);
            return result;
        }
    }
}

package home_work04;

import java.util.List;

/**
 * Created by user on 16.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(10);

        list.add("Nikita");
        list.add("Victor");
        list.add("Elena");
        list.add("Oleg");
        list.add("Anna");
        list.add("Anhelina");

        System.out.println(list.size());
        System.out.println(list.indexOf("Elena"));
        System.out.println(list);



    }
}

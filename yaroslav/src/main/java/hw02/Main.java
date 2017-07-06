package hw02;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Ярик on 06.07.2017.
 */
public class Main {
    static ArrayList<Counts> al = new ArrayList<Counts>();
    static LinkedList<Counts> ll = new LinkedList<Counts>();

    public static void main(String[] args) {
        Time t = new Time();
        Go go = new Go(0, 50000,99998);
        System.out.println("Добавление элементов : ");

//ArrayList add
        t.setStart(System.currentTimeMillis());
        Go.addArray();
        t.setEnd(System.currentTimeMillis());
        System.out.println("ArrayList " + t.getTime());

//LinkedList add
        t.setStart(System.currentTimeMillis());
        Go.addLinked();
        t.setEnd(System.currentTimeMillis());
        System.out.println("LinkedList " + t.getTime());

        System.out.println("\nПоиск элементов: ");

// ArrayList sertch
        t.setStart(System.currentTimeMillis());
        Go.surtchArray();
        t.setEnd(System.currentTimeMillis());
        System.out.println("ArrayList " + t.getTime());

// LinkedList sertch
        t.setStart(System.currentTimeMillis());
        Go.surtchLinked();
        t.setEnd(System.currentTimeMillis());
        System.out.println("LinkedList " + t.getTime());

        System.out.println("\nПерезапись элементов: ");

// ArrayList sertch
        t.setStart(System.currentTimeMillis());
        Go.rewriteArray();
        t.setEnd(System.currentTimeMillis());
        System.out.println("ArrayList " + t.getTime());

// LinkedList sertch
        t.setStart(System.currentTimeMillis());
        Go.rewriteLinked();
        t.setEnd(System.currentTimeMillis());
        System.out.println("LinkedList " + t.getTime());

        System.out.println("\nУдаление элементов: ");

// ArrayList remove
        t.setStart(System.currentTimeMillis());
        Go.removeArray();
        t.setEnd(System.currentTimeMillis());
        System.out.println("ArrayList " + t.getTime());

// LinkedList remove
        t.setStart(System.currentTimeMillis());
        Go.removeLinked();
        t.setEnd(System.currentTimeMillis());
        System.out.println("LinkedList " + t.getTime());
    }

}

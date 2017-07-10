package hw02_1;

import java.util.ArrayList;
import java.util.LinkedList;

import static hw02_1.Go.Method.*;
import static hw02_1.Go.Position.END;
import static hw02_1.Go.Position.MIDDLE;
import static hw02_1.Go.Position.START;

/**
 * Created by Ярик on 10.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        String value = "Hello world!";

        int count = 10000;

        ArrayList<String> arrayList = new ArrayList<String>();
        LinkedList<String> linkedList = new LinkedList<String>();
// ADD
        Go<String> go = new Go<String>(arrayList);

        long alStartAdd = go.add(value, count, START, ADD);
        long alMiddleAdd = go.add(value, count, MIDDLE, ADD);
        long alEndAdd = go.add(value, count, END, ADD);

        System.out.println("---- ArrayList ----");
        System.out.println("---- add() ----");
        System.out.printf("START: %d\nMIDLE: %d\nEND: %d\n",
                alStartAdd, alMiddleAdd, alEndAdd);

        go.setList(linkedList);
        long llStartAdd = go.add(value, count, START, ADD);
        long llMiddleAdd = go.add(value, count, MIDDLE, ADD);
        long llEndAdd = go.add(value, count, END, ADD);
        System.out.println();
        System.out.println("---- LinkedList ----");
        System.out.println("---- add() ----");
        System.out.printf("START: %d\nMIDLE: %d\nEND: %d\n",
                llStartAdd, llMiddleAdd, llEndAdd);
// GET
        go.setList(arrayList);
        long alStartGet = go.add(value, count, START, GET);
        long alMiddleGet = go.add(value, count, MIDDLE, GET);
        long alEndGet = go.add(value, count, END, GET);
        System.out.println();
        System.out.println("---- ArrayList ----");
        System.out.println("---- get() ----");
        System.out.printf("START: %d\nMIDLE: %d\nEND: %d\n",
                alStartGet, alMiddleGet, alEndGet);

        go.setList(linkedList);
        long llStartGet = go.add(value, count, START, GET);
        long llMiddleGet = go.add(value, count, MIDDLE, GET);
        long llEndGet = go.add(value, count, END, GET);
        System.out.println();
        System.out.println("---- LinkedList ----");
        System.out.println("---- get() ----");
        System.out.printf("START: %d\nMIDLE: %d\nEND: %d\n",
                llStartGet, llMiddleGet, llEndGet);
// SET
        go.setList(arrayList);
        long alStartSet = go.add(value, count, START, SET);
        long alMiddleSet = go.add(value, count, MIDDLE, SET);
        long alEndSet = go.add(value, count, END, SET);
        System.out.println();
        System.out.println("---- ArrayList ----");
        System.out.println("---- set() ----");
        System.out.printf("START: %d\nMIDLE: %d\nEND: %d\n",
                alStartSet, alMiddleSet, alEndSet);

        go.setList(linkedList);
        long llStartSet = go.add(value, count, START, SET);
        long llMiddleSet = go.add(value, count, MIDDLE, SET);
        long llEndSet = go.add(value, count, END, SET);
        System.out.println();
        System.out.println("---- LinkedList ----");
        System.out.println("---- set() ----");
        System.out.printf("START: %d\nMIDLE: %d\nEND: %d\n",
                llStartSet, llMiddleSet, llEndSet);
// REMOVE
        go.setList(arrayList);
        long alStartRemove = go.add(value, count, START, REMOVE);
        long alMiddleRemove = go.add(value, count, MIDDLE, REMOVE);
        long alEndRemove = go.add(value, count, END, REMOVE);
        System.out.println();
        System.out.println("---- ArrayList ----");
        System.out.println("---- remove() ----");
        System.out.printf("START: %d\nMIDLE: %d\nEND: %d\n",
                alStartRemove, alMiddleRemove, alEndRemove);

        go.setList(linkedList);
        long llStartRemove = go.add(value, count, START, REMOVE);
        long llMiddleRemove = go.add(value, count, MIDDLE, REMOVE);
        long llEndRemove = go.add(value, count, END, REMOVE);
        System.out.println();
        System.out.println("---- LinkedList ----");
        System.out.println("---- remove() ----");
        System.out.printf("START: %d\nMIDLE: %d\nEND: %d\n",
                llStartRemove, llMiddleRemove, llEndRemove);
    }
}

package reflect;


import java.util.ArrayList;
import java.util.LinkedList;

//import static reflect.Analyse.Methods.*;
//import static reflect.Analyse.Position.*;


/**
 * Created by Никита on 07.07.2017.
 */
public class Main {
    /*public static void main(String[] args) {
        String value = "Hello world!";

        int count = 10000;

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
// ADD
        Analyse<String> listAnalyzer = new Analyse<>(arrayList);

        long alStartAdd = listAnalyzer.add(value, count, START, ADD);
        long alMiddleAdd = listAnalyzer.add(value, count, MIDDLE, ADD);
        long alEndAdd = listAnalyzer.add(value, count, END, ADD);

        System.out.println("---- ArrayList ----");
        System.out.println("---- add() ----");
        System.out.printf("START: %d\nMIDLE: %d\nEND: %d\n",
                alStartAdd, alMiddleAdd, alEndAdd);

        listAnalyzer.setList(linkedList);
        long llStartAdd = listAnalyzer.add(value, count, START, ADD);
        long llMiddleAdd = listAnalyzer.add(value, count, MIDDLE, ADD);
        long llEndAdd = listAnalyzer.add(value, count, END, ADD);
        System.out.println();
        System.out.println("---- LinkedList ----");
        System.out.println("---- add() ----");
        System.out.printf("START: %d\nMIDLE: %d\nEND: %d\n",
                llStartAdd, llMiddleAdd, llEndAdd);
// GET
        listAnalyzer.setList(arrayList);
        long alStartGet = listAnalyzer.add(value, count, START, GET);
        long alMiddleGet = listAnalyzer.add(value, count, MIDDLE, GET);
        long alEndGet = listAnalyzer.add(value, count, END, GET);
        System.out.println();
        System.out.println("---- ArrayList ----");
        System.out.println("---- get() ----");
        System.out.printf("START: %d\nMIDLE: %d\nEND: %d\n",
                alStartGet, alMiddleGet, alEndGet);

        listAnalyzer.setList(linkedList);
        long llStartGet = listAnalyzer.add(value, count, START, GET);
        long llMiddleGet = listAnalyzer.add(value, count, MIDDLE, GET);
        long llEndGet = listAnalyzer.add(value, count, END, GET);
        System.out.println();
        System.out.println("---- LinkedList ----");
        System.out.println("---- get() ----");
        System.out.printf("START: %d\nMIDLE: %d\nEND: %d\n",
                llStartGet, llMiddleGet, llEndGet);
// SET
        listAnalyzer.setList(arrayList);
        long alStartSet = listAnalyzer.add(value, count, START, SET);
        long alMiddleSet = listAnalyzer.add(value, count, MIDDLE, SET);
        long alEndSet = listAnalyzer.add(value, count, END, SET);
        System.out.println();
        System.out.println("---- ArrayList ----");
        System.out.println("---- set() ----");
        System.out.printf("START: %d\nMIDLE: %d\nEND: %d\n",
                alStartSet, alMiddleSet, alEndSet);

        listAnalyzer.setList(linkedList);
        long llStartSet = listAnalyzer.add(value, count, START, SET);
        long llMiddleSet = listAnalyzer.add(value, count, MIDDLE, SET);
        long llEndSet = listAnalyzer.add(value, count, END, SET);
        System.out.println();
        System.out.println("---- LinkedList ----");
        System.out.println("---- set() ----");
        System.out.printf("START: %d\nMIDLE: %d\nEND: %d\n",
                llStartSet, llMiddleSet, llEndSet);
// REMOVE
        listAnalyzer.setList(arrayList);
        long alStartRemove = listAnalyzer.add(value, count, START, REMOVE);
        long alMiddleRemove = listAnalyzer.add(value, count, MIDDLE, REMOVE);
        long alEndRemove = listAnalyzer.add(value, count, END, REMOVE);
        System.out.println();
        System.out.println("---- ArrayList ----");
        System.out.println("---- remove() ----");
        System.out.printf("START: %d\nMIDLE: %d\nEND: %d\n",
                alStartRemove, alMiddleRemove, alEndRemove);

        listAnalyzer.setList(linkedList);
        long llStartRemove = listAnalyzer.add(value, count, START, REMOVE);
        long llMiddleRemove = listAnalyzer.add(value, count, MIDDLE, REMOVE);
        long llEndRemove = listAnalyzer.add(value, count, END, REMOVE);
        System.out.println();
        System.out.println("---- LinkedList ----");
        System.out.println("---- remove() ----");
        System.out.printf("START: %d\nMIDLE: %d\nEND: %d\n",
                llStartRemove, llMiddleRemove, llEndRemove);
    }*/
}

package queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Queue<String> strings = new LinkedList<>();

        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");

        String element = strings.element();
        System.out.println(element);

        System.out.println(strings);

        String peek = strings.peek();
        System.out.println(peek);

        System.out.println(strings);

        String poll = strings.poll();
        System.out.println(poll);

        System.out.println(strings);

        Deque<String> deque = new LinkedList<>();

        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

    }
}

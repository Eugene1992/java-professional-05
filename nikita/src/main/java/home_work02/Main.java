package home_work02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Никита on 07.07.2017.
 */
public class Main {
    public static void main(String[] args) {

        if (getTimeOfArray() < getTimeOfLinked()){
            System.out.println("ArrayList is faster!");
            if  (getTimeOfLinked() < getTimeOfArray()){
                System.out.println("LinkedList is faster!");
            } else {
                System.out.println("They're the same!");
            }
        }


    }

    static long getTimeOfLinked(){
        Player player1 = new Player("Andy Murray", 9390);
        Player player2 = new Player("Rafael Nadal", 7285);
        Player player3 = new Player("Stan Wawrinka", 6175);
        Player player4 = new Player("Novak Djokovic", 6055);
        Player player5 = new Player("Roger Federer", 5265);

        List<Player> list = new LinkedList<>();
        list.add(player1);
        list.add(player2);
        list.add(player3);
        list.add(player4);

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            list.add(4, player5);
            list.remove(3);
            list.set(3, player5);
            list.get(1);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);

        return end - start;
    }

    static long getTimeOfArray(){
        Player player1 = new Player("Andy Murray", 9390);
        Player player2 = new Player("Rafael Nadal", 7285);
        Player player3 = new Player("Stan Wawrinka", 6175);
        Player player4 = new Player("Novak Djokovic", 6055);
        Player player5 = new Player("Roger Federer", 5265);

        List<Player> list = new ArrayList<>(10);
        list.add(player1);
        list.add(player2);
        list.add(player3);
        list.add(player4);

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            list.add(4, player5);
            list.remove(3);
            list.set(3, player5);
            list.get(1);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);

        return end-start;
    }
}

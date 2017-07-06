package hw02;

/**
 * Created by Ярик on 06.07.2017.
 */
public class Go extends Main {
    private static int first;
    private static int mid;
    private static int last;

    public Go(int first, int mid, int last) {
        this.first = first;
        this.mid = mid;
        this.last = last;
    }

    // Добавление
    public static void addArray() {
        for (int i = 0; i < 100001; i++) {
            al.add(new Counts(Math.random()));
        }
    }

    public static void addLinked() {
        for (int i = 0; i < 100001; i++) {
            ll.add(new Counts(Math.random()));
        }
    }
// Поиск
    public static void surtchArray(){
        al.get(first);
        al.get(mid);
        al.get(last);
    }

    public static void surtchLinked(){
        ll.get(first);
        ll.get(mid);
        ll.get(last);
    }
//  Перезапись
    public static void rewriteArray(){
        al.set(first, new Counts(Math.random()));
        al.set(mid, new Counts(Math.random()));
        al.set(last, new Counts(Math.random()));
    }

    public static void rewriteLinked(){
        ll.set(first, new Counts(Math.random()));
        ll.set(mid, new Counts(Math.random()));
        ll.set(last, new Counts(Math.random()));
    }
//  Удаление
    public static void removeArray(){
        al.remove(first);
        al.remove(mid);
        al.remove(last);
    }

    public static void removeLinked(){
        ll.remove(first);
        ll.remove(mid);
        ll.remove(last);
    }
}


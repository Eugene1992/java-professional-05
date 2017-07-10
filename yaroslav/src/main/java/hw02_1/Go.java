package hw02_1;

import java.util.List;

import static hw02_1.Go.Position.END;
import static hw02_1.Go.Position.MIDDLE;

/**
 * Created by Ярик on 10.07.2017.
 */
public class Go<T> {
    private List<T> list;

    public Go(List<T> list) {
        this.list = list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public long add(T elem, int count, Position position, Method method) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            switch (method) {
                case ADD:
                    list.add(this.calcPosition(position), elem);
                    break;
                case GET:
                    list.get(this.calcPosition(position));
                    break;
                case SET:
                    list.set(this.calcPosition(position), elem);
                    break;
                case REMOVE:
                    list.remove(this.calcPosition(position));
                    break;
            }
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private int calcPosition(Position position) {
        int index = 0;
        if (position == MIDDLE) {
            index = list.size() / 2;
        }
        if (position == END) {
            index = list.size() - 1;
        }

        return index;
    }

    public enum Position {
        START, MIDDLE, END
    }

    public enum Method {
        ADD, GET, SET, REMOVE
    }
}

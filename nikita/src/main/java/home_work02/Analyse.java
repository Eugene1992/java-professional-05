package home_work02;

import java.util.List;

import static home_work02.Analyse.Position.END;
import static home_work02.Analyse.Position.MIDDLE;



/**
 * Created by Student on 7/7/2017.
 */
public class Analyse<T> {
    private List<T> list;

    public Analyse(List<T> list) {
        this.list = list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public long add(T elem, int count, Position position, Methods methods) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            switch (methods) {
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

    public enum Methods {
        ADD, GET, SET, REMOVE
    }
}

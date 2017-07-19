package hw05_1;

import java.util.Arrays;

public class List<T> {
    // CONSTANTS
    private final int DEFAULT_CAPACITY = 10;
    private int size = DEFAULT_CAPACITY;
    private T[] array;
    private T[] cash;


    public List(T[] array) {
        this.array = array;
    }

    public List(int size) {
        this.array = (T[]) new Object[size];
        this.cash = (T[]) new Object[size];
    }

    public List() {
        this.array = (T[]) new Object[size];
        this.cash = (T[]) new Object[size];
    }

    private void rangeCheck(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    private void checkCapasity() {
        int calc = 0;
        for (int index = 0; index < size; index++) {
            if (array[index] == null) {
                calc++;
            }
        }
        if (calc > size * 0.7) {
            size = size / 2 * 3 + 1;
        }
    }

    public void add(T elem) {
        checkCapasity();
        for (int index = 0; index < size; index++) {
            if (array[index] == null) {
                array[index] = elem;
                break;
            }
        }
    }

    public void add(int index, T elem) {
        checkCapasity(); // TODO: 19.07.2017 Understand what this method is doing?
        rangeCheck(index);
        cash = Arrays.copyOf(array, index - 1); // TODO: 19.07.2017 Get out into separate method
        cash[index] = elem;
        for (int i = index + 1; i < size; i++) {
            cash[i] = array[i - 1];
        }
        array = Arrays.copyOf(cash, size);
    }

    public void remove(int index){
        rangeCheck(index);
        cash = Arrays.copyOf(array, index - 1);
        for (int i = index; i < size; i++) {
            cash[i] = array[index];
        }
    }

    public void remove(T elem){
        for (int index = 0; index < size; index++) {
            if (array[index] == elem){
                cash = Arrays.copyOf(array, index - 1);
                for (int i = index; i < size; i++) {
                    cash[i] = array[index];
                }
                break;
            }
        }
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        return array[index];
    }

    public int indexOf(T elem) {
        for (int i = 0; i < size; i++) {
            if (elem.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public void set(int index, T elem) {
        rangeCheck(index);
        array[index] = elem;
    }

}

package hw05_1;

import java.util.Arrays;

public class List<T> {

    private final int DEFAULT_CAPACITY = 10;
    private int capacity = DEFAULT_CAPACITY;
    private int size = 0;
    private T[] array;


    public List(T[] array) {
        this.array = array;
    }

    public List(int capacity) {
        this.array = (T[]) new Object[capacity];
    }

    public List() {
        this.array = (T[]) new Object[capacity];
    }

    private void rangeCheck(int index) {
        if (index >= capacity) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + capacity);
        }
    }

    private void checkCapacity() {
        int calc = 0;
        for (int index = 0; index < capacity; index++) {
            if (array[index] == null) {
                calc++;
            }
        }
        if (calc > capacity * 0.7) {
            int  lastCapacity = capacity;
            capacity = capacity / 2 * 3 + 1;
            expendArray(lastCapacity);
        }
    }
    private void expendArray(int lastCapacity){
        T[] cash = Arrays.copyOf(array, lastCapacity);
        this.array = (T[]) new Object[capacity];
        this.array = Arrays.copyOf(cash, capacity);
    }

    public void add(T elem) {
        checkCapacity();
        for (int index = 0; index < capacity; index++) {
            if (array[index] == null) {
                array[index] = elem;
                break;
            }
        }
    }

    public void add(int index, T elem) {
        checkCapacity();
        rangeCheck(index);
        T[] cash = (T[]) new Object[capacity];
        cash = Arrays.copyOf(array, index - 1);
        cash[index] = elem;
        for (int i = index + 1; i < capacity; i++) {
            cash[i] = array[i - 1];
        }
        array = Arrays.copyOf(cash, capacity);
    }

    public void remove(int index){
        rangeCheck(index);
        T[] cash = Arrays.copyOf(array, index - 1);
        for (int i = index; i < capacity; i++) {
            cash[i] = array[index];
        }
    }

    public void remove(T elem){
        T[] cash;
        for (int index = 0; index < capacity; index++) {
            if (array[index] == elem){
                cash = Arrays.copyOf(array, index - 1);
                for (int i = index; i < capacity; i++) {
                    cash[i] = array[index];
                }
                break;
            }
        }
    }

    public int size() {
        int countOfNull=0;
        for(T elem: array){
            if(elem == null){
                countOfNull++;
            }
        }
        return size = capacity - countOfNull;
    }

    public T get(int index) {
        return array[index];
    }

    public int indexOf(T elem) {
        if (elem == null) {
            for (int i = 0; i < capacity; i++) {
                if (array[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < capacity; i++) {
                if (elem.equals(array[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void set(int index, T elem) {
        rangeCheck(index);
        array[index] = elem;
    }

}

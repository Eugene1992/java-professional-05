package hw05;

/**
 * Created by Ярик on 11.07.2017.
 */
public class Go<T> {
    private T[] array;
    private T[] cashBefore;
    private T[] cashAfter;
    private int size = 10;
    private int count;

    public Go(int size) {
        this.size = size;
    }
    public Go() {

    }

    private void sizeAdd(){
        size = (size / 2) * 3 + 1;
    }

    public void activate(){
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
    }

    private void chekIndex(int index){
        if(index > size){
            sizeAdd();
        }
    }

    private void chekElem(){
        int value = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == null)
                value++;
        }
        if (value == 0){
            sizeAdd();
        }
    }

    private T cash(int index, boolean addept){

        for (int i = 0; i < index; i++) {
            cashBefore[i] = array[i];
        }
        if(addept == true){
            for (int i = index + 1; i < size; i++) {
                cashAfter[i] = array[i];
            }
        }
        else{
            for (int i = index - 1; i < size ; i++) {
                cashAfter[i] = array[i];
            }
        }
        for (int i = 0; i < size; i++) {
            chekElem();
            array[i] = cashBefore[i];
            array[i] = cashAfter[i];
        }

        return array[size];
    }

    public T get(int index){
        return array[index];
    }

    public void add(T elem) {
        chekElem();
        for (int i = 0; i < size; i++) {
            if (array[i] != null) {
                array[i] = elem;
        }
    }
    }
    public void add(int index, T elem){
        chekIndex(index);
        chekElem();
        if(array[index] != null){
            cash(index, true);
            array[index] = elem;
        }
        else if(index == 0){
            for (int i = size + 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
        }
        else {
            array[index] = elem;
        }
    }
    public void set(int index, T elem){
        array[index] = elem;
    }
    public void remove(int index){
        if(array[index++] != null){
            cash(index, false);
        }
    }
    public void remove(T elem){
        for (int i = 0; i < size; i++) {
            if (array[i] == elem){
                remove(i);
            }
        }
    }
    public int size(){
        return size;
    }

    public int indexOf(T elem) {
        for (int i = 0; i < size; i++) {
            if (array[i] == elem) {
                return i;
            }
        }
        return 0;
    }
}

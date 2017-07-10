package cw04;

/**
 * Created by Ярик on 10.07.2017.
 */
public class Stack<T> {
    private T elem;
    private T [] array;
    private int count = 0;
    public void push(T elem){
        array[count] = elem;
        count++;
    }
    public T pop(){
        return array[size()];
    }

    public int size(){
        return array.length;
    }

    public int isEmpty(){
        if(count != 0){
            return 0;
        }
        return 1;
    }
}

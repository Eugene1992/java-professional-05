package cw04;

/**
 * Created by Ярик on 10.07.2017.
 */
public class Stack<T> {

    private T[] array;
    private int size = 0;

    public Stack(int size) {
        this.array = (T[])new Object[size];
    }

    public void push(T elem){
        array[size++] = elem;
    }

    public T pop(){
        return size > 0 ? array[--size] : null;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>(10);
        stack.push("1");
        stack.push("2");
        stack.push("3");

        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        stack.push("4");
        System.out.println(stack.pop());
    }
}

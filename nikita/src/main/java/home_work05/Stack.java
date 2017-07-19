package home_work05;

/**
 * Created by user on 16.07.2017.
 */
public class Stack {
    private int mSize;
    private int[] stackArray;
    private int top;

    public Stack(int m) {
        this.mSize = m;
        this.stackArray = new int[mSize];
        top = -1;
    }

    public void addElement(int element){
        stackArray[++top] = element;
    }

    public int deleteElement(){
        return stackArray[top--];
    }

    public int readTop(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == mSize - 1);
    }
}

package home_work05;


/**
 * Created by user on 16.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Stack mStack = new Stack(10);

        mStack.addElement(77);
        mStack.addElement(83);
        mStack.addElement(22);
        mStack.addElement(56);

        mStack.deleteElement();

        System.out.print("Stack: ");
        while(!mStack.isEmpty()){
            int value = mStack.deleteElement();
            System.out.println(value);
        }

        System.out.println("");
    }
}

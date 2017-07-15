package hw05_1;



public class List <T> {
// CONSTANTS
    final private int DEFAULT_CAPACITY = 10;
    private int size = DEFAULT_CAPACITY;
    private T[] array;
    private T[] cash;


    public List(T[] array) {
        this.array = array;
    }

    public List(int size) {
        this.array = (T[]) new Object[size];
    }

    public List(){
        this.array = (T[]) new Object[size];
    }

    private void rangeCheck(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }
    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }

    private void checkCapasity(){
        int calc = 0;
        for(int index = 0; index < size; index++){
            if(array[index] == null){
                calc++;
            }
        }
        if(calc == 0){
            size = size / 2 * 3 + 1;
        }
    }

    public void add(T elem){
        checkCapasity();
        for (int index = 0; index < size; index++){
            if(array[index] == null){
                array[index] = elem;
                break;
            }
        }
    }

    public void add(int index, T elem){
        checkCapasity();
        rangeCheck(index);
        array[index] = elem;
    }

    public int size(){
        return size;
    }

    public T get(int index){
        return array[index];
    }

    public int indexOf(T elem){
        for (int i = 0; i < size; i++) {
            if (elem == array[i]){
                return i;
            }
        }
        return -1;
    }

}

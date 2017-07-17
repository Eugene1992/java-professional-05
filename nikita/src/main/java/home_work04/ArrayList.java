package home_work04;

import java.util.Arrays;

/**
 * Created by user on 16.07.2017.
 */
public class ArrayList {
    private int maxSize;
    private Object[] arrayList;
    private int index;

    ArrayList(int m){
        this.maxSize = m;
        this.arrayList = new Object[maxSize];
        index = -1;
    }

    public Object get(int index){
        return arrayList[index];
    }

    public void add(Object o){
        arrayList[++index] = o;
    }

    public void add(int index, Object o){
        arrayList[++index] = o;
    }

    public void set(int index , Object o){
        arrayList[index] = o;
    }

    public void remove(int index){
        arrayList[index] = null;
    }

   // public boolean remove(Object o){

   // }

    @Override
    public String toString() {
        return "ArrayList{" +
                "maxSize=" + maxSize +
                ", arrayList=" + Arrays.toString(arrayList);
    }
    public int size(){
        return index;
    }

    public int indexOf(Object o){
        if (o == null) {
            for (int i = 0; i < index; i++)
                if (arrayList[i]==null)
                    return i;
        } else {
            for (int i = 0; i < index; i++)
                if (o.equals(arrayList[i]))
                    return i;
        }
        return -1;
    }
}

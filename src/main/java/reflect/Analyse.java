package reflect;

import java.util.List;

//import static reflect.Analyse.Position.END;
//import static reflect.Analyse.Position.MIDDLE;

/**
 * Created by Student on 7/7/2017.
 */
public class Analyse<T> {
    /*private List<T> list;

    public Analyse(List<T> list) {
        this.list = list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public long add(T elem, int count, Position position, Methods method) {
        long start = System.currentTimeMillis();
        Class<? extends List> aClass = list.getClass();
        for (int i = 0; i < count; i++) {
            aClass.getDeclaredMethod(method.name(), Integer.class).invoke()
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
        ADD("add", new Class[]{}), GET("get"), SET("set"), REMOVE("remove");

        public String methodName;
        private Class[] paramTypes;
        private Class[] args;

        Methods(String methodName, Class[] paramTypes, Class[] args) {
            this.methodName = methodName;
            this.paramTypes = paramTypes;
            this.args = args;
        }
    }*/
}

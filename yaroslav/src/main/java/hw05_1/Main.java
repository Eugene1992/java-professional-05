package hw05_1;

public class Main {
    public static void main(String args[]){
        List<String> list = new List<>();
        list.add(0,"Hello World!!");
        list.add("Hello World!!!!!!!!!!!!!!!!");
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.indexOf("Hello World!!"));
        System.out.println("-----------");
        for (int index = 0; index < 10; index++) {
            list.add(index, "index :" + index);
        }
        for (int index = 0; index < 10; index++) {
            System.out.println(list.get(index));
        }
    }
}

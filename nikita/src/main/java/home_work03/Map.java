package home_work03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by user on 15.07.2017.
 */
public class Map {
    public static void main(String[] args) {
        Map play = new Map();

        play.getString("we will play we will see");


    }

   public String getString(String phrase){
        String[] arr = phrase.split(" ");
       List list = Arrays.asList(arr);
       List<String> value = new ArrayList<>(list);
       HashMap<String, String> map = new HashMap<>();

       List<String> key = new ArrayList<>();

       for (int i = 0; i < arr.length; i++) {
           if(value.contains(arr[i])){
               value.remove(arr[i]);
           } else {
               key.add(arr[i]);
           }
       }


    //   for (int i = 0; i < key.size(); i++) {
    //       for (int j = 0; j < value.size(); j++) {
    //           map.put(key.get(i), value.get(i));
     //      }



       System.out.println(key + " " + value);


        return phrase;
    }
}

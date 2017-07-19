package home_work03;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 15.07.2017.
 */
public class MapTest {
    public static void main(String[] args) {
        MapTest test = new MapTest();

        Map<String, Integer> map = test.getString("we will play we will see");
        System.out.println(map);

    }

    public Map<String, Integer> getString(String phrase) {
        String[] arr = phrase.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        return map;
    }
}

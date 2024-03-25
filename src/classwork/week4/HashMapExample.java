package classwork.week4;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 0);
        map.put("Banana", 8);
        map.put("Cherry", 12);

        System.out.println("Value for key 'Banana': " + map.get("Banana"));
        System.out.println("size of the map: " + map.size());

        // Iterating over keys
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        // Iterating over values
        for (int value : map.values()) {
            System.out.println(value);
        }

        // Iterating over entries
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}

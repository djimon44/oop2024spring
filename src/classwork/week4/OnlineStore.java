package classwork.week4;

import java.util.ArrayList;
import java.util.List;

public class OnlineStore {
    private static List<String> objects = new ArrayList<>();

    public static String buy(String product) {
        if (objects.contains(product)) {
            objects.remove(product);
            return "yes";
        } else {
            return "no";
        }
    }
    public void addObject(String obj) {
        objects.add(obj);
    }

    public static void main(String[] args) {
        List<String> objects = new ArrayList<>();
        objects.add("Computer");
        objects.add("Smartphones");
        objects.add("Table");
        objects.add("Smart Watch");

        String answer = buy("Smart Watch");
        System.out.println(answer);

        answer = buy("Bag");
        System.out.println(answer);


    }
}

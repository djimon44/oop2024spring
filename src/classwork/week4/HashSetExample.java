package classwork.week4;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating HashSet to store string elements inside
        Set<String> fruits = new HashSet<>();

        // Adding elements ot the set
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Attempting to add duplicate elements
        boolean isAdded = fruits.add("Apple"); // returns false
        System.out.println("Was Apple added again? " + isAdded);

        // Checking if element exists
        boolean containsOrange = fruits.contains("Orange");
        System.out.println("Does the set contain Orange? " + containsOrange);

        // Removing the orange
        fruits.remove("Banana");
        System.out.println("HashSet after removal: " + fruits);

        //Iterating over elements
        System.out.println("Iterating over HashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

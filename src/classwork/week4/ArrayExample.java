package classwork.week4;

import java.util.ArrayList;

public class ArrayExample {
    public static void main(String[] args) {
        // Creating an ArrayList to store Integer elements
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Accessing elements
        System.out.println("Elements at index 1: " + numbers.get(1));

        // Modifying elements
        numbers.set(1, 25); // Set elements at index 1 to 25
        System.out.println("Modified ArrayList: " + numbers);

        // Removing elements
        numbers.remove(1); // Remove the element at index 1
        System.out.println("ArrayList after removal: " + numbers);

        // Iterating over elements
        System.out.println("Iterating over elements:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

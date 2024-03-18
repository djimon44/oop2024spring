package classwork;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.close();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int evenNumber = 2 * i;
            sum += evenNumber;
        }

        System.out.println("The sum of the first " + n + " even numbers is: " + sum);
    }
}
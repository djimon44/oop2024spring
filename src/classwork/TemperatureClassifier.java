package classwork;

import java.util.Scanner;

public class TemperatureClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        double temperature = sc.nextDouble();
        sc.close();

        String answer;

        if (temperature < 0) {
            answer = "Freezing";
        } else if (temperature >= 0 && temperature <= 15) {
            answer = "Cold";
        } else if (temperature >= 16 && temperature <= 25) {
            answer = "Mild";
        } else if (temperature >= 26 && temperature <= 35) {
            answer = "Warm";
        } else {
            answer = "Hot";
        }

        System.out.println("The temperature is: " + answer);
    }
}
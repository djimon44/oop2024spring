package classwork;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine();

            String[] parts = input.split(" ");

            if (parts.length != 3) {
                System.out.println("Invalid input! Please enter in the format: operation number1 number2");
                continue;
            }

            String operation = parts[0];
            double num1, num2;
            try {
                num1 = Double.parseDouble(parts[1]);
                num2 = Double.parseDouble(parts[2]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid numbers! Please enter valid numerical values.");
                continue;
            }

            double result;
            switch (operation) {
                case "add":
                    result = num1 + num2;
                    break;
                case "subtract":
                    result = num1 - num2;
                    break;
                case "multiply":
                    result = num1 * num2;
                    break;
                case "divide":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero!");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operation! Supported operations: add, subtract, multiply, divide");
                    continue;
            }
            System.out.println("Result: " + result);
            break;
        }
    }
}
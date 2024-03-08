package homework;
import java.util.Scanner;

class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a radius: ");
        int radius = scan.nextInt();

        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle with a radius " + radius + " is " + area);
    }
}
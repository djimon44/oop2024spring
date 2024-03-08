package homework;
import java.util.Scanner;

class MinToSec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter minutes: ");
        int minutes = scan.nextInt();

        int seconds = minutes * 60;
        System.out.println("There are " + seconds + " in " + minutes + " minutes");
    }
}


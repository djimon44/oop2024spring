package classwork.week4;

import java.util.HashSet;
import java.util.Scanner;

public class Library {
    private HashSet<String> books;

    public Library() {
        this.books = new HashSet<>();
    }

    public void addBook(String bookName) {
        books.add(bookName);
    }

    public boolean removeBook(String bookName) {
        return books.remove(bookName);
    }

    public boolean containsBook(String bookName) {
        return books.contains(bookName);
    }

    public boolean checkOutBook(String bookName) {
        if (books.contains(bookName)) {
            books.remove(bookName);
            return true; // Book taken successfully
        } else {
            return false; // Book not found in the library
        }
    }

    public boolean returnBook(String bookName) {
        if (!books.contains(bookName)) {
            books.add(bookName);
            return true; // Book returned successfully
        } else {
            return false; // Book already in the library or not found
        }
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (String book : books) {
            System.out.println("- " + book);
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Adding books to the library
        library.addBook("Alice in Wonderland");
        library.addBook("Catcher in a Rye");
        library.addBook("Pride and Prejudice");

        // Displaying books in the library
        library.displayBooks();

        // Taking a book from the library
        System.out.println("Enter the name of the book you want to take:");
        String bookName = scanner.nextLine();

        if (library.checkOutBook(bookName)) {
            System.out.println("You have successfully taken " + bookName + " from the library.");
        } else {
            System.out.println("Sorry, the book is already taken or not available in the library.");
        }

        // Displaying books in the library after removal (if any)
        library.displayBooks();

        // Returning a book to the library (optional)
        System.out.println("Do you want to return a book to the library? (yes/no)");
        String returnChoice = scanner.nextLine();

        if (returnChoice.equalsIgnoreCase("yes")) {
            System.out.println("Enter the name of the book you want to return:");
            bookName = scanner.nextLine();

            if (library.returnBook(bookName)) {
                System.out.println("You have successfully returned " + bookName + " to the library.");
            } else {
                System.out.println("Sorry, the book is already in the library or not found.");
            }
        } else {
            System.out.println("No book returned.");
        }

        // Displaying books in the library after return (if any)
        library.displayBooks();

        scanner.close(); // Close the scanner
    }
}
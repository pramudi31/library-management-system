package VersionB;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Library library = new Library();

        System.out.print("Enter the number of books: ");
        int n = input.nextInt();
        input.nextLine();

        // Add books
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Book " + (i + 1));

            System.out.print("Book ID: ");
            int id = input.nextInt();
            input.nextLine();

            System.out.print("Book Title: ");
            String title = input.nextLine();

            System.out.print("Author: ");
            String author = input.nextLine();

            Book book = new Book(id, title, author);
            library.addBook(book);
        }

        // Display all books
        System.out.println("\nLibrary Books");
        library.displayBooks();

        // Search for a book
        System.out.print("\nEnter the title of the book to search: ");
        String searchTitle = input.nextLine();

        library.searchBook(searchTitle);

        input.close();
    }
}
package VersionB;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {

        if (book != null) {
            books.add(book);
            System.out.println("Book added successfully");
        }
        else {
            System.out.println("Invalid book");
        }
    }

    public void displayBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available");
        }
        else {
            for (Book book : books) {
                System.out.println(book);
                System.out.println();
            }
        }
    }

    public void searchBook(String title) {

        boolean found = false;

        for (Book book : books) {

            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book Found:");
                System.out.println(book);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found");
        }
    }
}
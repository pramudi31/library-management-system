package VersionA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of books: ");
        int n = input.nextInt();
        input.nextLine();

        Library library = new Library(n);

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Book " + (i + 1));

            System.out.println("Enter Book ID: ");
            int id = input.nextInt();
            input.nextLine();

            System.out.println("Enter Book Title: ");
            String title = input.nextLine();

            System.out.println("Enter Author: ");
            String author = input.nextLine();

            Book book = new Book(id, title, author);
            library.addBook(book);
        }

        System.out.println("\nLibrary Books");
        library.displayBook();

        System.out.println("\nEnter Member Details");

        System.out.println("Enter Member ID: ");
        int memberID = input.nextInt();
        input.nextLine();

        System.out.println("Enter Member Name: ");
        String name = input.nextLine();

        Member member = new Member(memberID, name);

        System.out.println("\nMember Details");
        member.display();


    }
}
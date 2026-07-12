package VersionB;

public class Book {

    private int bookID;
    private String title;
    private String author;

    public Book(int bookID, String title, String author) {

        if (bookID <= 0) {
            System.out.println("Invalid Book ID");
        }

        this.bookID = bookID;
        this.title = title;
        this.author = author;
    }

    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookID +
                "\nTitle: " + title +
                "\nAuthor: " + author;
    }
}
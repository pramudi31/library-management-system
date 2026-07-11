public class Book {
    int bookID;
    String title;
    String author;

    public Book(int bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("Book ID:" + bookID);
        System.out.println("Title:" + title);
        System.out.println("Author:" + author);
    }
}
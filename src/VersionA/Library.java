package VersionA;

public class Library {

    Book[] books;
    int count = 0;

    public Library(int number){
        books = new Book[number];
    }

    public void addBook(Book book){
        books[count] = book;
        count = count++;
    }

    public void displayBook(){
        for (int i = 0; i<count ; i++){
            books[i].display();
            System.out.println();
        }
    }
}

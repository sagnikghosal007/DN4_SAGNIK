package Week1AlgoDS.Ex6LibraryManagementSystem;

public class Book {
    int bookId;
    String title;
    String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("Book ID: " + bookId + ", Title: " + title + ", Author: " + author);
    }
}

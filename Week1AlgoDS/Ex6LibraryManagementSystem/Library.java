package Week1AlgoDS.Ex6LibraryManagementSystem;

import java.util.*;

public class Library {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    // Linear Search
    public Book linearSearchByTitle(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Binary Search
    public Book binarySearchByTitle(String title) {

        Comparator<Book> compTitle = Comparator.comparing(b -> b.title.toLowerCase());


        books.sort(compTitle);


        Book searchKey = new Book(0, title, "");

        int index = Collections.binarySearch(books, searchKey, compTitle);
        return index >= 0 ? books.get(index) : null;
    }

    public void displayAllBooks() {
        for (Book book : books) {
            book.display();
        }
    }
}

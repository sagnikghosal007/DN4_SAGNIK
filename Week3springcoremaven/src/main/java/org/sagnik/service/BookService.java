package org.sagnik.service;

import org.sagnik.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;


    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String title) {
        System.out.println("Service: Adding book...");
        bookRepository.saveBook(title);
    }
}

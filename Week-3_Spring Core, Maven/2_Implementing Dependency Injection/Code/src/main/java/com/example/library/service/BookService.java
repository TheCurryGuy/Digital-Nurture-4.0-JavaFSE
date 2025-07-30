package com.example.library.service;

import com.example.library.repository.BookRepository;

public class BookService {
    private BookRepository bookDataRepository;

    // Spring framework uses this setter method to inject BookRepository dependency
    public void setBookRepository(BookRepository bookDataRepository) {
        this.bookDataRepository = bookDataRepository;
    }

    public void addBook(String bookTitle) {
        bookDataRepository.save(bookTitle);
    }
}

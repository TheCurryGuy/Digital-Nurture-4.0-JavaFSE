package com.example.library.service;

import com.example.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepo;

    // Dependency injection through setter method
    public void setBookRepository(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    public void registerNewBook(String bookTitle) {
        bookRepo.save(bookTitle);
    }
}

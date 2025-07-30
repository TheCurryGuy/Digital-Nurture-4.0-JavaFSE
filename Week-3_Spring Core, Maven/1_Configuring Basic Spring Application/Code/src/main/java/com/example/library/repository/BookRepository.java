package com.example.library.repository;

public class BookRepository {
    public void save(String bookTitle) {
        System.out.println("Successfully stored book in database: " + bookTitle);
    }
}

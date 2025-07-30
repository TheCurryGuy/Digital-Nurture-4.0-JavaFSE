package com.example.library;

import com.example.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryApp {
    public static void main(String[] args) {
        ApplicationContext applicationContainer =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookManagementService =
                (BookService) applicationContainer.getBean("bookService");

        // Testing dependency injection: this should invoke BookRepository.save(...)
        bookManagementService.addBook("Dependency Injection");
    }
}

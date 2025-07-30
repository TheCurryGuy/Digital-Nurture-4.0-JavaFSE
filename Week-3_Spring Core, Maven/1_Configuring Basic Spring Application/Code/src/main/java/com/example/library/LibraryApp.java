package com.example.library;

import com.example.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryApp {
    public static void main(String[] args) {
        ApplicationContext springContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookManagementService = (BookService) springContext.getBean("bookService");

        bookManagementService.registerNewBook("Spring Core Maven");
    }
}

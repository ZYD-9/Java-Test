package com.labrador.test_java.controller;

import com.labrador.test_java.model.Book;
import com.labrador.test_java.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

    @RestController
    @RequestMapping("/api/books")
    public  class BookController{

        private final BookService bookService;

        @Autowired
        public BookController(BookService bookService) {
            this.bookService = bookService;
        }

        @GetMapping
        public List<Book> getAllBooks(){
            return bookService.getAllBooks();
        }

        @GetMapping("/lang/en")
        public List<Book> getAllBooksLangEn(){
            return bookService.getBooksbyLanguage("English");
        }

    }



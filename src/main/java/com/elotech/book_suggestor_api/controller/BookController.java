package com.elotech.book_suggestor_api.controller;

import com.elotech.book_suggestor_api.exception.BookException;
import com.elotech.book_suggestor_api.model.Book;
import com.elotech.book_suggestor_api.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    
}

package com.LibraryApp.controllers;

import com.LibraryApp.entities.Books;
import com.LibraryApp.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping
public class BookControllers {

    @Autowired
    private BookServices bookServices;

    @GetMapping("/all")
    public ResponseEntity<List<Books>> getAllBooks() {
        List<Books> books = bookServices.getAllBook();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
}

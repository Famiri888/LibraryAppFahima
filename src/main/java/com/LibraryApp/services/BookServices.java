package com.LibraryApp.services;

import com.LibraryApp.entities.Books;
import com.LibraryApp.repositries.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServices {
    @Autowired
    private BooksRepository booksRepository;

    public BookServices(BooksRepository booksRepository) {
    }

    public List<Books> getAllBook() {
       return booksRepository.findAll();
    }
}

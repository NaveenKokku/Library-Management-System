package com.acciojob.LibraryManagement.Systems.Services;

import com.acciojob.LibraryManagement.Systems.Entities.Book;
import com.acciojob.LibraryManagement.Systems.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    public String addBook(Book book){
        bookRepository.save(book);
        return "Book added sucessfully";
    }
}

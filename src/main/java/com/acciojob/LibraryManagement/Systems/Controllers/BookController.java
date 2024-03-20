package com.acciojob.LibraryManagement.Systems.Controllers;

import com.acciojob.LibraryManagement.Systems.Entities.Book;
import com.acciojob.LibraryManagement.Systems.Services.BookService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("addbook")
    public ResponseEntity addBook(@RequestBody Book book){
        String res = bookService.addBook(book);
        return new ResponseEntity(res, HttpStatus.OK);
    }
}

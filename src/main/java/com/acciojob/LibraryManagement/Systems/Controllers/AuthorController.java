package com.acciojob.LibraryManagement.Systems.Controllers;

import com.acciojob.LibraryManagement.Systems.Entities.Author;
import com.acciojob.LibraryManagement.Systems.Services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("author")
public class AuthorController {
    @Autowired
    AuthorService authorService;
    @PostMapping("addauthor")
    public ResponseEntity registerAuthor(@RequestBody Author author){
        String res = authorService.addAuthor(author);
        return new ResponseEntity(res, HttpStatus.OK);
    }
}

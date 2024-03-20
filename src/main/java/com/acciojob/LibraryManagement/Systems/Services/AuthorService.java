package com.acciojob.LibraryManagement.Systems.Services;

import com.acciojob.LibraryManagement.Systems.Entities.Author;
import com.acciojob.LibraryManagement.Systems.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;
    public String addAuthor(Author author){
        authorRepository.save(author);
        return "Author registed sucessfully";
    }
}

package com.acciojob.LibraryManagement.Systems.Repositories;

import com.acciojob.LibraryManagement.Systems.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}

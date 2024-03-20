package com.acciojob.LibraryManagement.Systems.Repositories;

import com.acciojob.LibraryManagement.Systems.Entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer>{

}

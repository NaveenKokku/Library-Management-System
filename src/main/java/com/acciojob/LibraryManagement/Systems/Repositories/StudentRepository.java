package com.acciojob.LibraryManagement.Systems.Repositories;

import com.acciojob.LibraryManagement.Systems.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}

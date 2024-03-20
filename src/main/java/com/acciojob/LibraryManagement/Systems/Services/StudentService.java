package com.acciojob.LibraryManagement.Systems.Services;

import com.acciojob.LibraryManagement.Systems.Entities.Student;
import com.acciojob.LibraryManagement.Systems.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public String registerStudent(Student student){
        studentRepository.save(student);
        return "Student Admitted Successfully";
    }
}

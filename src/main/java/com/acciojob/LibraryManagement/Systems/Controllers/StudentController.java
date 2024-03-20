package com.acciojob.LibraryManagement.Systems.Controllers;

import com.acciojob.LibraryManagement.Systems.Entities.Student;
import com.acciojob.LibraryManagement.Systems.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/add")
    public String registerStudent(@RequestBody Student student){
        return studentService.registerStudent(student);
    }

}

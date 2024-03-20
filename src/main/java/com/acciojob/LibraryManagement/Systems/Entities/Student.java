package com.acciojob.LibraryManagement.Systems.Entities;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Getter //lombok annotations for simplyfing code it will create all the getters, setters, cons
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "studentinfo")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNo;
    private String name;
    private String branch;
    private Double cgpa;
    private String emailId;

}

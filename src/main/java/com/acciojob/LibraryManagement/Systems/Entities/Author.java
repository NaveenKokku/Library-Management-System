package com.acciojob.LibraryManagement.Systems.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Authortable")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer authorId;
    private String name;
    private Integer age;
    private String emailId;
    private Double rating;

    @Column(columnDefinition = "INT DEFAULT 0")
    private int numberofBooks;

}

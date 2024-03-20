package com.acciojob.LibraryManagement.Systems.Entities;

import com.acciojob.LibraryManagement.Systems.Enums.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;

    @Column(unique = true)
    private String title;

    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    private Integer price;
    private boolean isIssued;

    @JoinColumn
    @ManyToOne
    private Author author;

}

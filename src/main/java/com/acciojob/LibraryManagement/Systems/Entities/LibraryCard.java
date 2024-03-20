package com.acciojob.LibraryManagement.Systems.Entities;

import com.acciojob.LibraryManagement.Systems.Enums.CardStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "cardinfo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class LibraryCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardNo;

    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;

    private int noOfBooksIssued;
    private Date validity;

    @JoinColumn  //This tells that a new column is adding to the card-info table
    @OneToOne    //one to one join b/w 2 tables foreign key is student column
    private Student student;
}

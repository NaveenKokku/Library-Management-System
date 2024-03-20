package com.acciojob.LibraryManagement.Systems.Services;

import com.acciojob.LibraryManagement.Systems.Entities.LibraryCard;
import com.acciojob.LibraryManagement.Systems.Entities.Student;
import com.acciojob.LibraryManagement.Systems.Enums.CardStatus;
import com.acciojob.LibraryManagement.Systems.Repositories.CardRepository;
import com.acciojob.LibraryManagement.Systems.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

@Service
public class CardService {
    @Autowired
    CardRepository cardRepository;
    @Autowired
    StudentRepository studentRepository;
    public String generateCard(){
        LibraryCard libraryCard = new LibraryCard();
        libraryCard.setCardStatus(CardStatus.NEW);
        Date expiryDate = new Date(2028, 1, 2);
        libraryCard.setValidity(expiryDate);
        libraryCard.setNoOfBooksIssued(0);
       cardRepository.save(libraryCard);
        return "card generated with card id "+libraryCard.getCardNo();
    }

    public String associateCardandStudent(Integer cardId, Integer studentId){
        LibraryCard libraryCard = cardRepository.findById(cardId).get();
        Student student = studentRepository.findById(studentId).get();
        libraryCard.setStudent(student);
        libraryCard.setCardStatus(CardStatus.ISSUED);

        cardRepository.save(libraryCard);

        return "The student and card are associated";
    }
}

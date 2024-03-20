package com.acciojob.LibraryManagement.Systems.Controllers;

import com.acciojob.LibraryManagement.Systems.Services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/card")
public class CardController {
    @Autowired
    CardService cardService;

    @PostMapping("/generatecard")
    public ResponseEntity addCard(){
      String res =  cardService.generateCard();
      return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @PutMapping("/associateCardandStudent")
    public ResponseEntity associateCardandStudent(@RequestParam("cardId") Integer cardId,
                                          @RequestParam("studentId") Integer studentId){
        String res = cardService.associateCardandStudent(cardId, studentId);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}

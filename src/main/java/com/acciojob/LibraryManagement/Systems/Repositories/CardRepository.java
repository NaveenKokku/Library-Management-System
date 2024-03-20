package com.acciojob.LibraryManagement.Systems.Repositories;

import com.acciojob.LibraryManagement.Systems.Entities.LibraryCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<LibraryCard, Integer> {

}

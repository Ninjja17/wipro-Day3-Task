package com.wipro.Saving_information.repository;

import com.wipro.Saving_information.entity.Saving;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Savingrepo  extends JpaRepository<Saving , String>{
    Optional<Saving> findBysavingNumbers(String savingNumber) ;
}

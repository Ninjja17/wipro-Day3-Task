package com.wipro.Saving_information.controller;

import com.wipro.Saving_information.SavingInformationApplication;
import com.wipro.Saving_information.dto.Responsedto;
import com.wipro.Saving_information.service.SavingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.wipro.Saving_information.entity.Saving;

import java.util.List;

@RestController
@RequestMapping
public class SavingController {
    @Autowired
    private SavingService savingService;
    private SavingController serviceInformation;


    @PostMapping
    public Saving adduser(@RequestBody Saving saving) {
        return serviceInformation.adduser(saving);
    }

    @GetMapping("withaccount/{accountId}")
    public ResponseEntity<Responsedto> getuser(@PathVariable("accountNumber")String accountNumber ){
       Responsedto responsedto = SavingService.getuser(accountNumber);
       return ResponseEntity.ok(Responsedto);
    }
    }



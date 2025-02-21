package com.wipro.Account_services.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Account")

public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String accountNumber;
    public Long accountId;
    public Long  customerId;
    public String accountType;
    public Double accountBalance;
    public LocalDate dateCreated;
    public String status;

}

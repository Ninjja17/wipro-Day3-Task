package com.wipro.Saving_information.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Savingdto {
    private Long accountId;
    private Long customerId;
    private String accountNumber;
    private String accountType;
    private Double accountBalance;
    private LocalDate dateCreated;
    private String status;

    public Long getAccountId() {
        return  accountId;
    }

        public void setAccountId (Long accountId){
            this.accountId = accountId;
        }

        public Long getCustomerId(){
        return customerId;
        }
        public void setCustomerId(Long customerId){
        this.customerId = customerId ;
        }

        public String getAccountNumber(){
        return accountNumber ;
        }
        public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber ;
        }
        public  String getAccountType(){
        return accountType ;
        }
        public void setAccountType(String accountType){
        this.accountType = accountType ;
        }
        public Double getAccountBalance(){
        return accountBalance ;
        }
        public void setAccountBalance(Double accountBalance){
        this.accountBalance= accountBalance;
        }
        public LocalDate getDateCreated(){
        return dateCreated ;
        }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getStatus(){
        return status ;
        }

    public void setStatus(String status) {
        this.status = status;
    }
}


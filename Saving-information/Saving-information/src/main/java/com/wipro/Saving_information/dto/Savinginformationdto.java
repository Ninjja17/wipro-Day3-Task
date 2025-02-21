package com.wipro.Saving_information.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Savinginformationdto {
    public Long accountId ;
    public String name;
    public String email;
    public String password;
    public String location;
    public String savingBalance;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(String savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Object getSavingnumber() {
    }
}

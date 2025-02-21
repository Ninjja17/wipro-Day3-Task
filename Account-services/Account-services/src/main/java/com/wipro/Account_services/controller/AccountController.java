package com.wipro.Account_services.controller;

import com.wipro.Account_services.entity.Account;
import com.wipro.Account_services.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")

public class AccountController {
    @Autowired
    private AccountService accountService ;

    @PostMapping
    public Account create(@RequestBody Account saving) {
        return accountService.create;
        Object Account;
        Account(Account);
    }

    @GetMapping("{accountnumbers}")
    public List<Account> getAccount(@PathVariable String accountNumber ) {
        Object accountNumber;
        return service.getAccount(accountNumber);
    }

}

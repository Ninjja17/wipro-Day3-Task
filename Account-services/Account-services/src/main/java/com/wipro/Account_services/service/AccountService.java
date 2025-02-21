package com.wipro.Account_services.service;


import com.wipro.Account_services.entity.Account;
import com.wipro.Account_services.repository.Accountrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    public Account create;
    @Autowired
    private Accountrepo repo;

    public Account create(Account account){
        return repo.save(account);
    }

    public List<Account> getAccount(String accountnumber) {
        return null;
    }
}

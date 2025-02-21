package com.wipro.Account_services.repository;

import com.wipro.Account_services.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface  Accountrepo extends JpaRepository< Account, Float> {

}

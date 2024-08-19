package com.women.demo.controller;

import com.women.demo.entity.Account;
import com.women.demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin // Allow all origins (modify as needed)
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @PostMapping("/account")
    public ResponseEntity<Account> createAccount(@RequestBody Account account) {
        // Save the account in the database using the repository
        Account savedAccount = accountRepository.save(account);

        // Return a response entity with the saved account and HTTP status 201 (Created)
        return new ResponseEntity<>(savedAccount, HttpStatus.CREATED);
    }

    // Add more endpoints and methods as needed
}
package com.example.controller;

import com.example.entity.UserAccount;
import com.example.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping
    public List<UserAccount> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    // Add more endpoints for account management operations
}

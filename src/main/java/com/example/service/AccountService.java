package com.example.service;

import com.example.entity.UserAccount;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private UserRepository userRepository;

    public List<UserAccount> getAllAccounts() {
        return userRepository.findAll();
    }

    // Add more methods as needed, such as createUserAccount, updateUserAccount, etc.
}

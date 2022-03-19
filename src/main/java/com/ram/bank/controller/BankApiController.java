package com.ram.bank.controller;

import com.ram.bank.data.User;
import com.ram.bank.service.UserAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
public class BankApiController {

    @Autowired
    UserAccountService userAccountService;

    @GetMapping("/user")
    public List<User> getAllUsers(){
        log.info("Started fetching the users data");
        return userAccountService.getUserData();
    }

    @PostMapping("/user")
    public User persistTheUser(@RequestBody User user){
        log.info("Started saving the user");
        return userAccountService.saveUser(user);
    }

    @GetMapping("/user/{accountNumber}")
    public User getUserByName(@PathVariable Integer accountNumber) {
        log.info("Started fetching the user for given accountNumber {}", accountNumber);
        return userAccountService.getUserByAccountNumber(accountNumber);
    }


}

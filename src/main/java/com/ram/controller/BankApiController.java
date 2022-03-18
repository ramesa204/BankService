package com.ram.controller;

import com.ram.data.User;
import com.ram.service.UserAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Slf4j
@RestController
public class BankApiController {

    @Autowired
    UserAccountService userAccountService;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        log.info("Started fetching the users");
        return userAccountService.getUserData();
    }


}

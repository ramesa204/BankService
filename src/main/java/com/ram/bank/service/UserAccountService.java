package com.ram.bank.service;

import com.ram.bank.data.User;

import java.util.List;

public interface UserAccountService {

    List<User> getUserData();

    User saveUser(User user);

    User getUserByAccountNumber(Integer accountNumber);
}

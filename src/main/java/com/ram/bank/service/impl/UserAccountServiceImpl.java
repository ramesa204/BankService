package com.ram.bank.service.impl;

import com.ram.bank.exception.UserNotFoundException;
import com.ram.bank.data.User;
import com.ram.bank.repo.UserRepository;
import com.ram.bank.service.UserAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Slf4j
@Service
public class UserAccountServiceImpl implements UserAccountService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUserData() {
        List<User> userList = userRepository.findAll();
        log.info("{} users are retrieved ",userList.size());
        return userList;
    }

    @Override
    public User saveUser(User user) {
        log.info("Persisting the user for name {}",user.getName());
        User savedUser = userRepository.save(user);
        log.info("User saved for id {} and name {}",user.getId(),user.getName());
        return savedUser;
    }

    @Override
    public User getUserByName(String name) {
        log.info("Finding the user for name {}",name);
        User retrievedUser = userRepository.findByName(name);
        if(retrievedUser!=null)
        log.info("User Fetched for id {} and name {}",retrievedUser.getId(),retrievedUser.getName());
        else
            throw new UserNotFoundException("User is not found for given name "+name);
        return retrievedUser;
    }

    private List<User>  createUserData(){
        List<User> users = new ArrayList<>();
        User user0 = new User(1,"Ramesh",258796340,25896.32,true);
        User user1 = new User(2,"Mahesh",258796341,1024.25,true);
        User user2 = new User(3,"Suresh",258796342,875.14,false);
        User user3 = new User(4,"Santosh",258796343,145783.28,true);
        User user4 = new User(5,"Prasad",258796343,147.2,false);
        User user5 = new User(6,"Venkatesh",258796344,58796.24,true);
        users.add(user0); users.add(user1); users.add(user2); users.add(user3); users.add(user4); users.add(user5);
        return users;
    }
}

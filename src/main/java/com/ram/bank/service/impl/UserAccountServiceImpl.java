package com.ram.bank.service.impl;

import com.ram.bank.data.User;
import com.ram.bank.service.UserAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Slf4j
@Service
public class UserAccountServiceImpl implements UserAccountService {
    @Override
    public List<User> getUserData() {
        List<User> userList = createUserData();
        log.info("{} users are retrieved ",userList.size());
        return createUserData();
    }

    private List<User>  createUserData(){
        List<User> users = new ArrayList<>();
        User user0 = new User(1,"Ramesh",258796340L,25896.32,true);
        User user1 = new User(2,"Mahesh",258796341L,1024.25,true);
        User user2 = new User(3,"Suresh",258796342L,875.14,false);
        User user3 = new User(4,"Santosh",258796343L,145783.28,true);
        User user4 = new User(5,"Prasad",258796343L,147.2,false);
        User user5 = new User(6,"Venkatesh",258796344L,58796.24,true);
        users.add(user0); users.add(user1); users.add(user2); users.add(user3); users.add(user4); users.add(user5);
        return users;
    }
}

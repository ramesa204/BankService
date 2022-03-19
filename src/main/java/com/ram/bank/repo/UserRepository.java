package com.ram.bank.repo;

import com.ram.bank.data.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByName(String name);
    User findByAccountNumber(Integer accountNumber);
}

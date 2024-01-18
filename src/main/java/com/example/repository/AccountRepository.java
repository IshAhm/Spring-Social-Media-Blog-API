package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
    public boolean existsByUsername(String username);
    public Account findByUsernameAndPassword(String username, String password);
}

package com.megaproject.dao;

import com.megaproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {
    List<User> findBylogin(String login);

    List<User> findByEmail(String email);
}

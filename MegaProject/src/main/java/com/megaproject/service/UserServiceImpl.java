package com.megaproject.service;

/**
 * Created by nik on 25.10.2016.
 */

import com.megaproject.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Override
    public User getUser(String login) {
        User result = new User(login, "7110eda4d09e062aa5e4a390b0a572ac0d2c0220");
        return result;
    }
}

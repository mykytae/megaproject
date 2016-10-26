package com.megaproject.service;

/**
 * Created by nik on 25.10.2016.
 */

import com.megaproject.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Override
    public User getUser(String login, String password, String name, String surname, String role, String bankAccount) {
        User result = new User(login, password,name,surname,role,bankAccount);
        return result;
    }
}

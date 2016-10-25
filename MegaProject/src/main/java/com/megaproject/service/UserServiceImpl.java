package com.megaproject.service;

/**
 * Created by nik on 25.10.2016.
 */

import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Override
    public User getUser(String login) {
        return null;
    }
}

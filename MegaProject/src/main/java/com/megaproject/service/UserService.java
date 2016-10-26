package com.megaproject.service;


import com.megaproject.entity.User;

import java.util.List;

/**
 * Created by nik on 25.10.2016.
 */
public interface UserService {
    public User getUser (String login, String password, String name, String surname, String role, String bankAccount);

}

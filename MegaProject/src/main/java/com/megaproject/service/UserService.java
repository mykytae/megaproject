package com.megaproject.service;


import com.megaproject.entity.User;

/**
 * Created by nik on 25.10.2016.
 */
public interface UserService {
    User getUser (String login);
}

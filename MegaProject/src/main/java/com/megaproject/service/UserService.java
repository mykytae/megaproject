package com.megaproject.service;


import com.megaproject.entity.User;
import com.megaproject.exeptions.UserNotFound;

import java.util.List;

/**
 * Created by nik on 25.10.2016.
 */
public interface UserService {

    public User create(User user);
    public User delete(int id) throws UserNotFound;
    public List findAll();
    public User update(User user) throws UserNotFound;
    public User findById(int id);
    public User getUser (String login, String password, String name, String surname, String role, String bankAccount);
    public User findByLogin(String login);
    public User findByEmail(String email);



}

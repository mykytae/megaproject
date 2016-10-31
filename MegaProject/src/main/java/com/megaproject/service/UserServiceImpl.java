package com.megaproject.service;

/**
 * Created by nik on 25.10.2016.
 */

import com.megaproject.dao.UserDao;
import com.megaproject.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    @Transactional
    public List findAll() {
        return userDao.findAll();
    }

    @Override
    @Transactional
    public User findByLogin(String login) {
       List<User> list = findAll();
        for(User user : list ){
            if (user.getLogin().equals(login)){
                return user;
            }
        }
        return null;
    }


}

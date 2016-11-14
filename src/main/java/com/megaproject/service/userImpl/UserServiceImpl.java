package com.megaproject.service.userImpl;

/**
 * Created by nik on 25.10.2016.
 */


import com.megaproject.dao.UserDao;

import com.megaproject.entity.User;
import com.megaproject.exeptions.UserNotFound;
import com.megaproject.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    @Transactional
    public User create(User user) {
        User createdUser = user;
        return userDao.save(createdUser);
    }

    @Override
    @Transactional(rollbackFor = UserNotFound.class)
    public User delete(int id) throws UserNotFound {
        User deletedUser = userDao.findOne(id);
        if(deletedUser==null){
            throw new UserNotFound();
        }
        userDao.delete(deletedUser);
        return deletedUser;

    }


    @Override
    @Transactional
    public User findById(int id) {
        return userDao.findOne(id);
    }

    @Override
    @Transactional
    public User getUser(String login, String password, String name, String surname, String role, String bankAccount) {
        return null;
    }

    @Override
    @Transactional
    public List findAll() {
        return userDao.findAll();
    }

    @Override
    @Transactional
    public User update(User user) throws UserNotFound {
        User updatedUser = userDao.findOne(user.getId());
        updatedUser.setLogin(user.getLogin());
        updatedUser.setName(user.getName());
        updatedUser.setSurname(user.getSurname());
        updatedUser.setEmail(user.getEmail());
        return updatedUser;
    }

    @Override
    public User findByLogin(String login) {
       List<User> list = userDao.findBylogin(login);
        for(User user : list ){
            if (user.getLogin().equals(login)){
                return user;
            }
        }
        return null;
    }

    @Override
    public User findByEmail(String email) {
        List<User> list = userDao.findBylogin(email);
        for(User user : list ){
            if (user.getLogin().equals(email)){
                return user;
            }
        }
        return null;
    }


}

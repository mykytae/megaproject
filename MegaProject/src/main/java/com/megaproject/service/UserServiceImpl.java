package com.megaproject.service;

/**
 * Created by nik on 25.10.2016.
 */

import com.megaproject.dao.UserRepository;
import com.megaproject.entity.User;
import com.megaproject.exeptions.UserNotFound;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

@Resource
private UserRepository userRepository;

    @Override
    @Transactional
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    @Transactional(rollbackFor = UserNotFound.class)
    public User delete(int id) throws UserNotFound {
        User deletedUser = userRepository.findOne(id);
        if(deletedUser==null){
            throw new UserNotFound();
        }
        userRepository.delete(deletedUser);
        return deletedUser;

    }

    @Override
    @Transactional(rollbackFor = UserNotFound.class)
    public User update(User user) throws UserNotFound {
        User updatedUser = userRepository.findOne(user.getId());
        if(updatedUser==null){
            throw new UserNotFound();
        }
        updatedUser.setLogin(user.getLogin());
        updatedUser.setPassword(user.getPassword());
        updatedUser.setBankAccount(user.getBankAccount());
        updatedUser.setSurname(user.getSurname());
        updatedUser.setName(user.getName());
        updatedUser.setRole(user.getRole());

        return updatedUser;
    }

    @Override
    public User findById(int id) {
        return userRepository.findOne(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String login, String password, String name, String surname, String role, String bankAccount) {
        User result = new User(login, password,name,surname,role,bankAccount);
        return result;
    }
}

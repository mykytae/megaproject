package com.megaproject.dao;

import com.megaproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by nik on 28.10.2016.
 */
public interface UserDao extends JpaRepository<User, Integer> {

}
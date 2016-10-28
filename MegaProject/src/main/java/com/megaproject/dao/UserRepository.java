package com.megaproject.dao;

import com.megaproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dn050886sdp on 28.10.16.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}

package com.megaproject.dao;

import com.megaproject.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by nik on 07.11.2016.
 */
public interface RoleDao extends JpaRepository<Role, Integer> {
    Role findByUserId (int userId);
}

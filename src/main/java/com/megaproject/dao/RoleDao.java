package com.megaproject.dao;

import com.megaproject.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Integer> {
    Role findByUserId(int userId);
}

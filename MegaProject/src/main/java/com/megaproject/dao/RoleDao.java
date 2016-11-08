package com.megaproject.dao;

import com.megaproject.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by nik on 07.11.2016.
 */
public interface RoleDao extends JpaRepository<Role, Integer> {

}

package com.megaproject.service;

import com.megaproject.entity.Role;

import java.util.List;

public interface RoleService {

    public Role create(Role role);

    public List findAll();

    public Role findByUserId(int id);

    public Role update(Role role, String ROLE_NAME);
}

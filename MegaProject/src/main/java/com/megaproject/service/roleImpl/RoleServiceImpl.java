package com.megaproject.service.roleImpl;

import com.megaproject.dao.RoleDao;
import com.megaproject.entity.Role;
import com.megaproject.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by nik on 07.11.2016.
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    RoleDao roleDao;

    @Override
    @Transactional
    public Role create(Role role) {
        Role createdRole = role;
        return roleDao.save(createdRole);
    }

    @Override
    @Transactional
    public List findAll() {
        return roleDao.findAll();
    }

    @Override
    @Transactional
    public Role findByUserId(int id) {
        return roleDao.findOne(id);
    }

    @Override
    @Transactional
    public Role update(Role role, String ROLE_NAME) {
        Role updatedRole = roleDao.findByUserId(role.getUserId());
        updatedRole.setRoleName(ROLE_NAME);
        return updatedRole;
    }
}

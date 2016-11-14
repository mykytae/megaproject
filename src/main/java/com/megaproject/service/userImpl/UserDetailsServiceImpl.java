package com.megaproject.service.userImpl;

import com.megaproject.entity.Role;
import com.megaproject.entity.User;
import com.megaproject.service.RoleService;
import com.megaproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by nik on 25.10.2016.
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private int userIdLogin;

    public int getUserIdLogin() {
        return userIdLogin;
    }

    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        UserDetails result = null;

        User user = userService.findByLogin(login);
        if(user==null){
            return result;
        }

        this.userIdLogin=user.getId();

        Role role = roleService.findByUserId(userIdLogin);
        if (role==null){
            return result;
        }

        Set<GrantedAuthority> roles = new HashSet();
        roles.add(new SimpleGrantedAuthority(role.getRoleName()));

        result = new org.springframework.security.core.userdetails.User(user.getLogin(), user.getPassword(), roles);
        return result;
    }
}

package com.megaproject.controller;

import com.megaproject.entity.Role;
import com.megaproject.service.RoleService;
import com.megaproject.service.userImpl.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    RoleService roleService;

    @Autowired
    UserDetailsServiceImpl userDetailsService;

    @RequestMapping(value = "/open", method = RequestMethod.GET)
    public ModelAndView openSession() {
        ModelAndView model = new ModelAndView();
        int userHomeId = userDetailsService.getUserLoginId();

        Role role = roleService.findByUserId(userHomeId);

        if (role.getRoleName().equals(MainController.ROLE_ADMIN)) {
            model.setViewName("redirect:/admin");
        } else if (role.getRoleName().equals(MainController.ROLE_USER)) {
            model.setViewName("redirect:/home");
        }
        return model;
    }
}

package com.megaproject.controller;

import com.megaproject.entity.Role;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import static com.megaproject.controller.MainController.roleService;
import static com.megaproject.controller.MainController.userHomeId;


@Controller
@RequestMapping("/")
public class UserController {

    @RequestMapping(value = "/open", method = RequestMethod.GET)
    public ModelAndView openSession() {
        ModelAndView model = new ModelAndView();
        Role role = roleService.findByUserId(userHomeId);
        if (role.getRoleName().equals(MainController.ROLE_ADMIN)) {
            model.setViewName("redirect:/admin");
        } else if (role.getRoleName().equals(MainController.ROLE_USER)) {
            model.setViewName("redirect:/home");
        }
        return model;
    }
}

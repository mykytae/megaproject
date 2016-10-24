package com.megaproject.controller;

import com.megaproject.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by nik on 17.10.2016.
 */
@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping(value = "/admin", method= RequestMethod.GET)
    public String showAdmin(ModelMap model){
    User user = new User(5,"Vanya",23456789);
    model.addAttribute("userList", user.getUserList(user));
    return "Admin";
    }

    @RequestMapping(value = "/signup", method= RequestMethod.GET)
    public String SignUp (ModelMap model){
        return "Registration";
    }

    @RequestMapping(value = "/home", method= RequestMethod.GET)
    public String Home (ModelMap model){
        return "User";
    }


}

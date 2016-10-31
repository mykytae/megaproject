package com.megaproject.controller;
import com.megaproject.dao.UserDao;
import com.megaproject.service.UserService;
import com.megaproject.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by nik on 17.10.2016.
 */
@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private UserService userService;



    @RequestMapping(value = "/admin", method= RequestMethod.GET)
    public ModelAndView userAdmin(){
        ModelAndView model = new ModelAndView();
        List userList = userService.findAll();
        model.addObject("userList", userList);
        model.setViewName("admin");
        return model ;
    }

    @RequestMapping(value = "/signup", method= RequestMethod.GET)
    public String SignUp (ModelMap model){
        return "Registration";
    }

    @RequestMapping(value = "/home", method= RequestMethod.GET)
    public String Home (ModelMap model){
        return "User";
    }

    @RequestMapping(value = {"/","/login"},method= RequestMethod.GET)
    public ModelAndView LogIn (@RequestParam (value="error", required = false) String error) {
        ModelAndView model = new ModelAndView();
        if (error != null) {
            error = "Your username or password is incorrect!";
            model.addObject("error", error);
        }
        model.setViewName("login");
        return model;

    }

    //
}

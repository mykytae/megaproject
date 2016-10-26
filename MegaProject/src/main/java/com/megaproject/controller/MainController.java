package com.megaproject.controller;
import com.megaproject.service.UserService;
import com.megaproject.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by nik on 17.10.2016.
 */
@Controller
@RequestMapping("/")
public class MainController {





    @RequestMapping(value = "/admin", method= RequestMethod.GET)
    public String showAdmin(ModelMap model){
        User user = new User("root","root","root","root", "ADMIN","12345root");
        model.addAttribute("userList", User.getUserList(user));
    return "admin";
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

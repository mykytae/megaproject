package com.megaproject.controller;
import com.megaproject.dao.UserDao;
import com.megaproject.service.UserDetailsServiceImpl;
import com.megaproject.service.UserService;
import com.megaproject.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    private final String ROLE_ADMIN = "ROLE_ADMIN";
    private final String ROLE_USER = "ROLE_USER";

    @Autowired
    private UserService userService;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

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

        return "registration";
    }

    @RequestMapping(value = "/home", method= RequestMethod.GET)
    public ModelAndView Home (){
        int userId = userDetailsService.userIdLogin; //берем id во время того как спринг секьюрити проверяет наш логин и пароль
        ModelAndView model = new ModelAndView();
        User user = userService.findById(userId);

        model.addObject("name", user.getName() );
        model.addObject("surname", user.getSurname() );
        model.setViewName("user");


        return model ;
    }

    @RequestMapping(value="/register", method=RequestMethod.POST)
    public ModelAndView registration (@RequestParam("login") String login,
                                      @RequestParam("name") String name,
                                      @RequestParam("surname") String surname,
                                      @RequestParam("email") String email,
                                      @RequestParam("password") String password){

        ModelAndView model = new ModelAndView();

        User user = new User(login, password, name, surname, ROLE_USER, email);
        User userCheckLogin = userService.findByLogin(login);
        User userCheckEmail = userService.findByEmail(email);


        if (userCheckLogin==null && userCheckEmail==null ){
            model.addObject("errorLogin", "Your login already exsists!");
            model.addObject("errorEmail", "This email already uses! Try to ");
            model.setViewName("registration");
        }
        else if (userCheckLogin==null){
            model.addObject("errorLogin", "Your login already exsists!");
            model.setViewName("registration");
        }
        else if (userCheckEmail==null){
            model.addObject("errorEmail", "This email already uses! Try to ");
            model.setViewName("registration");
        }

        userService.create(user);
        model.addObject("success", "You was succesful registered ! Please, SIGN IN.");
        model.setViewName("login");

        return model;

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

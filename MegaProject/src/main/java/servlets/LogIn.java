package servlets;

import models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by nik on 17.10.2016.
 */
@Controller
@RequestMapping("/megaproject")
public class LogIn  {

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

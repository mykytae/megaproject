package com.megaproject.controller;

import com.megaproject.entity.BankAccount;
import com.megaproject.entity.History;
import com.megaproject.entity.Role;
import com.megaproject.service.BankAccountService;
import com.megaproject.service.HistoryService;
import com.megaproject.service.RoleService;
import com.megaproject.service.userImpl.UserDetailsServiceImpl;
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

@Controller
@RequestMapping("/")
public class MainController {

    static final String ROLE_ADMIN = "ROLE_ADMIN";
    static final String ROLE_USER = "ROLE_USER";
    private static final double startBalanceOfMoney = 0.0;

    @Autowired
    BankAccountService bankAccountService;

    @Autowired
    UserService userService;

    @Autowired
    UserDetailsServiceImpl userDetailsService;

    @Autowired
    RoleService roleService;

    @Autowired
    HistoryService historyService;

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String goToSignUpPage(ModelMap model) {
        return "registration";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView goToHomePage() {
        int userHomeId = userDetailsService.getUserLoginId();
        ModelAndView model = new ModelAndView();

        User user = userService.findById(userHomeId);

        BankAccount bankAccount = bankAccountService.findByUserId(userHomeId);

        Role role = roleService.findByUserId(userHomeId);

        List<History> historyList = historyService.findByUserId(userHomeId);

        model.addObject("role", role);
        model.addObject("bankAccount", bankAccount);
        model.addObject("historyList", historyList);
        model.addObject("login", user.getLogin());
        model.addObject("name", user.getName());
        model.addObject("surname", user.getSurname());
        model.setViewName("user");

        return model;
    }

    /*
    This method creates the new User (with ROLE_USER), new AccountNumber and start balance.
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView doRegistration(@RequestParam("login") String login,
                                       @RequestParam("name") String name,
                                       @RequestParam("surname") String surname,
                                       @RequestParam("email") String email,
                                       @RequestParam("password") String password) {
        ModelAndView model = new ModelAndView();

        surname = surname.length() > 30 ? AdminController.cutParameter(surname, 30) : surname;
        email = email.length() > 60 ? AdminController.cutParameter(email, 60) : email;

        if (!(model = isUserDataCorrect(model, login, email)).isEmpty()) {
            model.setViewName("registration");
            return model;
        }
        User createdUser = userService.create(new User(login, password, name, surname, email));
        int createdUserId = createdUser.getId();

        roleService.create(new Role(ROLE_USER, createdUserId));

        List<BankAccount> bankList = bankAccountService.findList();
        int maxAccountNumber = bankList.get(0).getAccountNumber();
        for (BankAccount bankAccount : bankList) {
            int tempAccountNumber = bankAccount.getAccountNumber();
            if (tempAccountNumber > maxAccountNumber) {
                maxAccountNumber = tempAccountNumber;
            }
        }
        bankAccountService.save(new BankAccount(maxAccountNumber + 1, startBalanceOfMoney, createdUserId));

        model.addObject("success", "You was successful registered ! Please, SIGN IN.");
        model.setViewName("login");
        return model;
    }

    @RequestMapping(value = {"/", "/login"}, method = RequestMethod.GET)
    public ModelAndView logIn(@RequestParam(value = "error", required = false) String error) {
        ModelAndView model = new ModelAndView();

        if (error != null) {
            error = "Your username or password is incorrect!";
            model.addObject("error", error);
        }

        model.setViewName("login");
        return model;
    }

    private ModelAndView isUserDataCorrect(ModelAndView model, String login, String email) {
        User userCheckLogin = userService.findByLogin(login);
        User userCheckEmail = userService.findByEmail(email);

        if (userCheckLogin != null && userCheckEmail != null) {
            model.addObject("errorLogin", "Your login already exsists!");
            model.addObject("errorEmail", "This email already uses!");
            return model;
        } else if (userCheckLogin != null) {
            model.addObject("errorLogin", "Your login already exsists!");
            model.setViewName("registration");
            return model;
        } else if (userCheckEmail != null) {
            model.addObject("errorEmail", "This email already uses!");
            model.setViewName("registration");
            return model;
        }
        return model;
    }
}

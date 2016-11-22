package com.megaproject.controller;
import com.megaproject.entity.BankAccount;
import com.megaproject.entity.History;
import com.megaproject.entity.Role;
import com.megaproject.exeptions.UserNotFound;
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
import org.springframework.web.util.NestedServletException;

import javax.annotation.Resource;
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
    private BankAccountService bankAccountService;

    @Autowired
    private UserService userService;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private HistoryService historyService;


    @RequestMapping(value= "/open", method=RequestMethod.GET)
    public ModelAndView openSession (){
        ModelAndView model = new ModelAndView();
        int userHomeId = userDetailsService.getUserIdLogin();
        Role role = roleService.findByUserId(userHomeId);
        if(role.getRoleName().equals(ROLE_ADMIN)){
            model.setViewName("redirect:/admin");

        }
        else if (role.getRoleName().equals(ROLE_USER)){
            model.setViewName("redirect:/home");
        }

        return model;
    }
        @RequestMapping(value = "/admin", method= RequestMethod.GET)
    public ModelAndView userAdmin(){
        ModelAndView model = new ModelAndView();

        List<User> userList = userService.findAll();
        List <BankAccount> bankAccountList = bankAccountService.findList();
        List <Role> roleList = roleService.findAll();

        model.addObject("bankList",bankAccountList);
        model.addObject("roleList", roleList);
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
        ModelAndView model = new ModelAndView();
        int userHomeId = userDetailsService.getUserIdLogin();

        User user = userService.findById(userHomeId);
        BankAccount bankAccount = bankAccountService.findByUserId(userHomeId);
        Role role = roleService.findByUserId(userHomeId);
        List <History> historyList = historyService.findByUserId(userHomeId);

        model.addObject("role", role);
        model.addObject("bankAccount", bankAccount);
        model.addObject("historyList", historyList);
        model.addObject("login", user.getLogin());
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

        User user = new User(login, password, name, surname, email);
        User userCheckLogin = userService.findByLogin(login);
        User userCheckEmail = userService.findByEmail(email);

        if (userCheckLogin!=null && userCheckEmail!=null ){
            model.addObject("errorLogin", "Your login already exsists!");
            model.addObject("errorEmail", "This email already uses! ");
            model.setViewName("registration");
            return model;
        }
        else if (userCheckLogin!=null){
            model.addObject("errorLogin", "Your login already exsists!");
            model.setViewName("registration");
            return model;
        }
        else if (userCheckEmail!=null){
            model.addObject("errorEmail", "This email already uses! Try to ");
            model.setViewName("registration");
            return model;
        }

        userService.create(user);
        User createdUser = userService.findByLogin(login);

        Role role = new Role (ROLE_USER, createdUser.getId());
        roleService.create(role);

        List<BankAccount> bankList = bankAccountService.findList();
        BankAccount bankNumber = bankList.get(bankList.size()-1);
        BankAccount bankAccount = new BankAccount(bankNumber.getAccountNumber()+1, 0.0, createdUser.getId());
        bankAccountService.save(bankAccount);

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

    @RequestMapping(value = "/pay", method = RequestMethod.GET)
    public ModelAndView pay (@RequestParam (value="increase", required = false) String increase){
        ModelAndView model = new ModelAndView();
        if (increase!=null){
            increase="pay";
         model.addObject("increase", increase);
        }
        model.setViewName("pay");
        return model;
    }

    @RequestMapping(value = "/admin/add", method = RequestMethod.GET)
    public ModelAndView addToAdmin (@RequestParam (value="admin", required = false) String changeRole,
                                    @RequestParam ("login") String login,
                                    @RequestParam ("name") String name,
                                    @RequestParam ("surname") String surname,
                                    @RequestParam ("email") String email,
                                    @RequestParam ("id") int id) throws UserNotFound {

        ModelAndView model = new ModelAndView();
        if (changeRole!=null){
            Role role=roleService.findByUserId(id);
            roleService.update(role, ROLE_ADMIN);
        }
        User user = new User();
        user.setId(id);
        user.setLogin(login);
        user.setName(name);
        user.setSurname(surname);
        user.setEmail(email);
        userService.update(user);

        model.setViewName("redirect:/admin");
        return model;
    }

    @RequestMapping(value = "/payment", method = RequestMethod.POST)
    public ModelAndView payment(@RequestParam ("sources") String operation,
                                @RequestParam ("reason") String reason,
                                @RequestParam ("money") double money){
        ModelAndView model = new ModelAndView();
        int userHomeId = userDetailsService.getUserIdLogin();

        BankAccount bankAccount = bankAccountService.findByUserId(userHomeId);
        History history = null;
        history = new History(history.dateGenerator(), operation, bankAccount.getId(), userHomeId, reason, money);
        historyService.create(history);

        model.setViewName("redirect:/home");
        return model;
    }

}

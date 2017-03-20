package com.megaproject.controller;

import com.megaproject.entity.BankAccount;
import com.megaproject.entity.History;
import com.megaproject.service.BankAccountService;
import com.megaproject.service.HistoryService;
import com.megaproject.service.userImpl.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class PayController {

    @Autowired
    BankAccountService bankAccountService;

    @Autowired
    HistoryService historyService;

    @Autowired
    UserDetailsServiceImpl userDetailsService;

    @RequestMapping(value = "/pay", method = RequestMethod.GET)
    public ModelAndView goToPayPage(@RequestParam(value = "increase", required = false) String increase) {
        ModelAndView model = new ModelAndView();
        int userHomeId = userDetailsService.getUserLoginId();

        if (increase != null) {
            increase = "pay";
            model.addObject("increase", increase);
        }
        BankAccount bankAccount = bankAccountService.findByUserId(userHomeId);
        String date = historyService.generateDate();

        model.addObject("bankAccount", bankAccount);
        model.addObject("date", date);
        model.setViewName("pay");

        return model;
    }

    @RequestMapping(value = "/payment", method = RequestMethod.POST)
    public ModelAndView doPayment(@RequestParam("sources") String operation,
                                  @RequestParam("reason") String reason,
                                  @RequestParam("money") String money) {
        ModelAndView model = new ModelAndView();
        int userHomeId = userDetailsService.getUserLoginId();
        double price = Double.parseDouble(money.replace(",", "."));

        BankAccount bankAccount = bankAccountService.findByUserId(userHomeId);
        double payment = bankAccount.getAccountValue();
        if (operation.equals("income")) {
            payment = payment + price;
        } else {
            payment = payment - price;
        }
        bankAccount.setAccountValue(payment);
        bankAccountService.update(bankAccount);

        historyService.create(new History(historyService.generateDate(), operation, bankAccount.getId(), userHomeId, reason, price));

        model.setViewName("redirect:/home");
        return model;
    }
}

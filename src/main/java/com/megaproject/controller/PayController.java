package com.megaproject.controller;

import com.megaproject.entity.BankAccount;
import com.megaproject.entity.History;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import static com.megaproject.controller.MainController.bankAccountService;
import static com.megaproject.controller.MainController.historyService;
import static com.megaproject.controller.MainController.userHomeId;

@Controller
@RequestMapping("/")
public class PayController {

    @RequestMapping(value = "/pay", method = RequestMethod.GET)
    public ModelAndView goToPayPage(@RequestParam(value = "increase", required = false) String increase) {
        ModelAndView model = new ModelAndView();
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
                                  @RequestParam("money") double money) {
        ModelAndView model = new ModelAndView();

        BankAccount bankAccount = bankAccountService.findByUserId(userHomeId);
        double payment = bankAccount.getAccountValue();
        if (operation.equals("income")) {
            payment = payment + money;
        } else {
            payment = payment - money;
        }
        bankAccount.setAccountValue(payment);
        bankAccountService.update(bankAccount);

        History history = new History(historyService.generateDate(), operation, bankAccount.getId(), userHomeId, reason, money);
        historyService.create(history);

        model.setViewName("redirect:/home");
        return model;
    }
}

package com.megaproject.service.bankAccountImpl;

import com.megaproject.dao.BankAccountDao;
import com.megaproject.entity.BankAccount;
import com.megaproject.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by nik on 18.11.2016.
 */
@Service
public class BankAccountServiceImpl implements BankAccountService {

    @Resource
    BankAccountDao bankAccountDao;



    @Override
    public List<BankAccount> findList() {
        List<BankAccount> bankList = bankAccountDao.getBankAccountList();
        return bankList;
    }

    @Override
    public BankAccount findById(int id) {
        BankAccount bankAccountFinder = null;
        for (BankAccount bankAccount : findList()){
            if(bankAccount.getId()==id){
                bankAccountFinder=bankAccount;
            }
        }
        return bankAccountFinder;
    }

    @Override
    public BankAccount findByUserId(int userId) {
        BankAccount bankAccountFinder = null;
        for (BankAccount bankAccount : findList()){
            if(bankAccount.getUserId()==userId){
                bankAccountFinder=bankAccount;
            }
        }
        return bankAccountFinder;
    }
}

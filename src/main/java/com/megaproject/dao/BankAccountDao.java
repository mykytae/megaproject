package com.megaproject.dao;

import com.megaproject.entity.BankAccount;

import java.util.List;

/**
 * Created by nik on 17.11.2016.
 */
public interface BankAccountDao {
    public List<BankAccount> getBankAccountList();
    public void saveNewBankAccount(BankAccount bankAccount);
    public void update (BankAccount bankAccount);
}

package com.megaproject.service;

import com.megaproject.entity.BankAccount;

import java.util.List;

/**
 * Created by nik on 18.11.2016.
 */
public interface BankAccountService {
    public List<BankAccount> findList();
    public BankAccount findById(int id);
    public BankAccount findByUserId(int userId);
    public void save(BankAccount bankAccount);
    public void update(BankAccount bankAccount);
}

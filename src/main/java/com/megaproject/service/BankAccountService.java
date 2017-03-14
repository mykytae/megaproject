package com.megaproject.service;

import com.megaproject.entity.BankAccount;

import java.util.List;

public interface BankAccountService {

    public List<BankAccount> findList();

    public BankAccount findById(int id);

    public BankAccount findByUserId(int userId);

    public void save(BankAccount bankAccount);

    public void update(BankAccount bankAccount);
}

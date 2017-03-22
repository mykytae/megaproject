package com.megaproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "BANK_ACCOUNT")
public class BankAccount {

    public BankAccount(int accountNumber, double accountValue, int userId) {
        this.accountValue = accountValue;
        this.userId = userId;
        this.accountNumber = accountNumber;
    }

    public BankAccount() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "ACCOUNT_NUMBER")
    private int accountNumber;

    @Column(name = "ACCOUNT_VALUE")
    private double accountValue;

    @Column(name = "USER_ID")
    private int userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountValue() {
        return accountValue;
    }

    public void setAccountValue(double accountValue) {
        this.accountValue = accountValue;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

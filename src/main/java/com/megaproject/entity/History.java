package com.megaproject.entity;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "HISTORY")
public class History {

    public History(String date, String operation, int bankAccountId, int userId, String reason, double money) {
        this.userId = userId;
        this.date = date;
        this.operation = operation;
        this.bankAccountId = bankAccountId;
        this.reason = reason;
        this.money = money;
    }

    public History() {

    }

    @Id
    @GeneratedValue
    @Column(name = "ID")
    int id;

    @Column(name = "DATE")
    String date;

    @Column(name = "OPERATION")
    String operation;

    @Column(name = "USER_ID")
    int userId;

    @Column(name = "BANK_ACCOUNT_ID")
    int bankAccountId;

    @Column(name = "REASON")
    String reason;

    @Column(name = "MONEY")
    double money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(int bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public static String dateGenerator() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

}

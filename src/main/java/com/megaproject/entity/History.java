package com.megaproject.entity;



import javax.persistence.*;

/**
 * Created by nik on 07.11.2016.
 */
@Entity
@Table(name="HISTORY")
public class History {

    @Id
    @GeneratedValue
    @Column(name="ID")
    int id;

    @Column(name="DATE")
    String date;

    @Column(name="OPERATION")
    String operation;

    @Column(name="USER_ID")
    int userId;

    @Column(name="BANK_ACCOUNT_ID")
    int bankAccountId;

    @Column(name="REASON")
    String reason;

    @Column(name="MONEY")
    double money;


    public History() {

    }

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

}

package com.megaproject.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nik on 17.10.2016.
 */
public class User {
    public String login;
    public String pass;

    public int id;
    public long bankAccount;
    static List<User> users = new ArrayList<User>();

    public User(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    public User(int id, String login, long bankAccount){
        this.id=id;
        this.login=login;
        this.bankAccount=bankAccount;

    }

    public List<User> getUserList(User user){
        users.add(user);
        return users;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(long bankAccount) {
        this.bankAccount = bankAccount;
    }
}

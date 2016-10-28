package com.megaproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nik on 17.10.2016.
 */
@Entity
@Table(name = "shops")
public class User {
    @GeneratedValue
    private Integer id;
    public String login;
    public String password;
    public String name;
    public String surname;
    public String role;
    public String bankAccount;

    public User(){
    };

    public User(String login, String password, String name, String surname, String role, String bankAccount) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.role = role;
        this.bankAccount = bankAccount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public static List<User> getUserList(User user) {
        List<User> list = new ArrayList<>();
        list.add(user);
        return list;
    }

}





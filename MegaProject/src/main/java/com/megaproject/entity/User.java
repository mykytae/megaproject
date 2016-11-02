package com.megaproject.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nik on 17.10.2016.
 */


@Entity
@Table(name="USER")
public class User {

    public User(String login, String password, String name, String surname, String role, String email) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.role = role;
        this.email= email;
    }

    public User(){

    }


    @Id
    @GeneratedValue
    @Column(name="ID")
    public int id;

    @Column(name="LOGIN")
    public String login;

    @Column(name="PASSWORD")
    public String password;

    @Column(name="NAME")
    public String name;

    @Column(name="SURNAME")
    public String surname;

    @Column(name="ROLE")
    public String role;

    @Column (name="EMAIL")
    public String email;


    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static List<User> getUserList(User user) {
        List<User> list = new ArrayList<>();
        list.add(user);
        return list;
    }

}





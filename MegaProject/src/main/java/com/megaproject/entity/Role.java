package com.megaproject.entity;

import javax.persistence.*;


/**
 * Created by nik on 07.11.2016.
 */
@Entity
@Table(name="ROLE")
public class Role {

    public Role(String roleName, int userId) {
        this.roleName = roleName;
        this.userId = userId;
    }

    public Role(){

    }

    @Id
    @GeneratedValue
    @Column(name="ID")
    int id;

    @Column(name="ROLE_NAME")
    String roleName;

    @Column(name="USER_ID")
    int userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

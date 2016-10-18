package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nik on 17.10.2016.
 */
public class User {
    public String User;
    public String Pass;
    public int Id;
    public long BankAccount;

    public User(int Id, String User, long BankAccount){
        this.Id=Id;
        this.User=User;
        this.BankAccount=BankAccount;
    }

    public List<User> getUserList(User user){
        List<User> users = new ArrayList<User>();
        users.add(user);
        return users;
    }
}

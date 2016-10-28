package com.megaproject.exeptions;

/**
 * Created by dn050886sdp on 28.10.16.
 */
public class UserNotFound extends Exception{

    public UserNotFound(){
    }

    public UserNotFound(String message){
        super(message);
    }
}

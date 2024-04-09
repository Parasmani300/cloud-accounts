package com.redchat.Account.controller;

public class UserNotFoundException extends  Exception{
    public UserNotFoundException(String ex){
        super(ex);
    }
}

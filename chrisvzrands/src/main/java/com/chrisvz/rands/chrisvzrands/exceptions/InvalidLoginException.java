package com.chrisvz.rands.chrisvzrands.exceptions;

/**
 * @author Kristijan Klepač
 * Dec 2, 2018
 * chrisvzrands
 */
public class InvalidLoginException {
    private String username;
    private String password;

    public InvalidLoginException() {
        this.username = "Invalid Username";
        this.password = "Invalid Password";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

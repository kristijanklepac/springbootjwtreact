package com.chrisvz.rands.chrisvzrands.exceptions;

/**
 * @author Kristijan Klepač
 * Dec 2, 2018
 * chrisvzrands
 */
public class UsernameAlreadyExistsResponse {

    private String username;

    public UsernameAlreadyExistsResponse(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

package com.chrisvz.rands.chrisvzrands.payloads;

import javax.validation.constraints.NotBlank;

/**
 * @author Kristijan Klepač
 * Dec 2, 2018
 * chrisvzrands
 */
public class LoginRequest {

    @NotBlank(message = "Username cannot be blank")
    private String username;
    @NotBlank(message = "Password cannot be blank")
    private String password;

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

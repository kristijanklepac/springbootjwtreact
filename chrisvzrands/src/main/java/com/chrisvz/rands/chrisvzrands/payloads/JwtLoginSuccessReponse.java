package com.chrisvz.rands.chrisvzrands.payloads;

/**
 * @author Kristijan Klepač
 * Dec 2, 2018
 * chrisvzrands
 */
public class JwtLoginSuccessReponse {
    private boolean success;
    private String token;

    public JwtLoginSuccessReponse(boolean success, String token) {
        this.success = success;
        this.token = token;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "JWTLoginSucessReponse{" +
                "success=" + success +
                ", token='" + token + '\'' +
                '}';
    }
}

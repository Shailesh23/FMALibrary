package com.fma.ui.login;

/**
 * Created by Shal on 22-07-2015.
 */
public class LoginIntractorImpl implements LoginIntractor {
    @Override
    public void validateUser(String userName, String password, OnFinishedLogin listener) {

        //TODO: change this to a db or network call
        if (userName == null || userName.length() == 0 || userName.equals("1")) {
            listener.onLoginError();
        } else if (password == null || password.length() == 0 || password.equals("1")) {
            listener.onPasswordError();
        } else {
            listener.onSuccess();
        }
    }
}

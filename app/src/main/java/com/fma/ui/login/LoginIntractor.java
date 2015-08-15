package com.fma.ui.login;

/**
 * Created by Shal on 22-07-2015.
 */
public interface LoginIntractor {
    public void validateUser(String userName, String password, OnFinishedLogin loginListner);
}

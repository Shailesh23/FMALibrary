package com.fma.ui.login;

/**
 * Created by Shal on 22-07-2015.
 */
public interface LoginView {
    public void setUsernameError();

    public void setPasswordError();

    public void navigateToHome();

    public void showProgressBar();

    public void hideProgressBar();
}

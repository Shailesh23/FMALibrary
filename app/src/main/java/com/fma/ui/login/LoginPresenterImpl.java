package com.fma.ui.login;

/**
 * Created by Shal on 22-07-2015.
 */
public class LoginPresenterImpl implements LoginPresenter, OnFinishedLogin {
    private final LoginIntractor loginIntractor;
    private LoginView loginView;

    //TODO: add dagger injection
    public LoginPresenterImpl(LoginView loginview) {
        this.loginView = loginview;
        loginIntractor = new LoginIntractorImpl();
    }

    @Override
    public void validateCredentials(String userName, String password) {
        loginIntractor.validateUser(userName, password, this);
    }

    @Override
    public void onLoginError() {
        loginView.setUsernameError();
    }

    @Override
    public void onPasswordError() {
        loginView.setPasswordError();
    }

    @Override
    public void onSuccess() {
        loginView.navigateToHome();
    }
}

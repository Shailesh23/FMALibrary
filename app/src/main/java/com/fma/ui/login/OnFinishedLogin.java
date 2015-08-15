package com.fma.ui.login;

/**
 * Created by Shal on 22-07-2015.
 */
public interface OnFinishedLogin {
    public void onLoginError();

    public void onPasswordError();

    public void onSuccess();
}

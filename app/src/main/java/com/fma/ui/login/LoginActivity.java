package com.fma.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.examples.dagger.fmalibrary.BaseActivity;
import com.fma.ui.home.HomeActivity;
import com.examples.dagger.fmalibrary.R;
import com.fma.utils.SnackBarUtil;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class LoginActivity extends BaseActivity implements LoginView {
    @Bind(R.id.text_pass)
    EditText editPass;

    @Bind(R.id.text_email)
    EditText editEmail;

    @Bind(R.id.btn_sign_in)
    Button btnSignIn;

    @Bind(R.id.linear_container)
    LinearLayout parentContainer;

    LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);
        presenter = new LoginPresenterImpl(this);
    }

    @OnClick(R.id.btn_sign_in)
    public void signInHandler(View view) {
        presenter.validateCredentials(editEmail.getText().toString(), editPass.getText().toString());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void setUsernameError() {
        editEmail.setText("");
        SnackBarUtil.createSnackbar("Please check your user name", parentContainer);
    }

    @Override
    public void setPasswordError() {
        editPass.setText("");
        SnackBarUtil.createSnackbar("Please check your password", parentContainer);
    }

    @Override
    public void navigateToHome() {
        Intent moveToHome = new Intent(this, HomeActivity.class);
        startActivity(moveToHome);
    }

    @Override
    public void showProgressBar() {

    }

    @Override
    public void hideProgressBar() {

    }
}

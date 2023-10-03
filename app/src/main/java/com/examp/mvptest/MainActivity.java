package com.examp.mvptest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MainActivityContract.view {
    MainActivityContract.Presenter presenter;
    EditText email, password;
    Button loginButton, logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainActivityPresenter(this);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);

        loginButton = findViewById(R.id.loginButton);
        logoutButton = findViewById(R.id.logoutButton);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email1 = email.getText().toString();
                String password1 = password.getText().toString();

                if (TextUtils.isEmpty(email1) || TextUtils.isEmpty(password1)){
                    onError("Field(s) Requird");

                }else {
                    presenter.doLogin(email1,password1);
                }

            }
        });





        }

    @Override
    public void onSuccess(String massage) {
        Toast.makeText(this,massage,Toast.LENGTH_LONG).show();

    }

    @Override
    public void onError(String massage) {
        Toast.makeText(this,massage,Toast.LENGTH_LONG).show();

    }
}
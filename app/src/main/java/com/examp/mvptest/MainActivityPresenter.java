package com.examp.mvptest;

public class MainActivityPresenter implements MainActivityContract.Presenter{
    MainActivityContract.view view;

    public MainActivityPresenter(MainActivityContract.view view) {
        this.view = view;
    }

    @Override
    public void doLogin(String email, String password) {

        if (email.equals("nony@gopal.com")& password.equals("Nony123")){
            view.onSuccess("SuccessFull");

        }else {
            view.onError("Wrong email id or password");
        }

    }
}

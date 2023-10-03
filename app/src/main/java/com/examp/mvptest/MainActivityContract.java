package com.examp.mvptest;

public interface MainActivityContract {
    interface view{
        void onSuccess(String massage);
        void onError(String massage);

    }
    interface Presenter{
        void doLogin(String email, String password);
    }
}

package com.example.xback.fishtracker.main;

import android.support.v7.app.AppCompatActivity;

/**
 * responsible for view and updating the UI as required
 */


public class MainPresenter implements MainContract.Presenter {
    private MainContract.MvpView mView;

    MainPresenter(MainContract.MvpView view){
        mView = view;
    }

}

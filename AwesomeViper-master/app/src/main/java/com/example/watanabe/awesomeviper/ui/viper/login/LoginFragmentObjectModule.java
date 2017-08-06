package com.example.watanabe.awesomeviper.ui.viper.login;

import android.support.v4.app.Fragment;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginFragmentObjectModule {

    private LoginContract.View view;

    public LoginFragmentObjectModule(LoginContract.View view) {
        this.view = view;
    }

    @Provides
    public LoginPresenter providePresenter(LoginInteractor interactor,
                                           LoginRouter router) {
        return new LoginPresenter((Fragment) view, view, interactor, router);
    }
}

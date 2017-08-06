package com.example.watanabe.awesomeviper.ui.viper.login;

import javax.inject.Inject;

import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;


public class LoginInteractor implements LoginContract.Interactor {

    private LoginContract.InteractorOutput out;
    private Disposable disposables = Disposables.empty();

    @Inject
    public LoginInteractor() {
        // add dependencies
    }

    @Override
    public void startInteraction(LoginContract.InteractorOutput out) {
        this.out = out;
    }

    @Override
    public void stopInteraction(LoginContract.InteractorOutput out) {
        this.disposables.dispose();
        this.out = null;
    }
}

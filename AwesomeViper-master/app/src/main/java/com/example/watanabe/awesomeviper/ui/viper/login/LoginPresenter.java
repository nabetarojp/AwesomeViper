package com.example.watanabe.awesomeviper.ui.viper.login;

import android.support.v4.app.Fragment;

import javax.inject.Inject;


public class LoginPresenter implements LoginContract.Presenter, LoginContract.InteractorOutput {

    private LoginViewModel viewModel = new LoginViewModel();

    private Fragment fragment;
    private LoginContract.View view;
    private LoginContract.Interactor interactor;
    private LoginContract.Router router;

    @Inject
    public LoginPresenter(Fragment fragment,
                          LoginContract.View view,
                          LoginContract.Interactor interactor,
                          LoginContract.Router router) {
        this.fragment = fragment;
        this.view = view;
        this.interactor = interactor;
        this.router = router;
    }

    @Override
    public void onResume() {
        interactor.startInteraction(this);
    }

    @Override
    public void onPause() {
        interactor.stopInteraction(this);
    }

    @Override
    public void onError(Throwable t) {
        view.showError(t.getMessage() != null ? t.getMessage() : "error");
    }
}

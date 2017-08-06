package com.example.watanabe.awesomeviper.ui.navigation.setting;

import android.support.v4.app.Fragment;

import javax.inject.Inject;


public class SettingPresenter implements SettingContract.Presenter, SettingContract.InteractorOutput {

    private SettingsViewModel viewModel = new SettingsViewModel();

    private Fragment fragment;
    private SettingContract.View view;
    private SettingContract.Interactor interactor;
    private SettingContract.Router router;

    @Inject
    public SettingPresenter(Fragment fragment,
                            SettingContract.View view,
                            SettingContract.Interactor interactor,
                            SettingContract.Router router) {
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

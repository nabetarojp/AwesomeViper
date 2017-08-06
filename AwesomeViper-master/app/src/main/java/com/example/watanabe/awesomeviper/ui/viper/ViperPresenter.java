package com.example.watanabe.awesomeviper.ui.viper;


import android.app.Activity;

import javax.inject.Inject;

public class ViperPresenter implements ViperContract.Presenter, ViperContract.InteractorOutput {

    private ViperViewModel viewModel = new ViperViewModel();

    private Activity activity;
    private ViperContract.View view;
    private ViperContract.Interactor interactor;
    private ViperContract.Router router;

    @Inject
    public ViperPresenter(Activity activity,
                          ViperContract.View view,
                          ViperContract.Interactor interactor,
                          ViperContract.Router router) {
        this.activity = activity;
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

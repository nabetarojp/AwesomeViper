package com.example.watanabe.awesomeviper.ui.hoge;


import android.app.Activity;

import javax.inject.Inject;

public class HogePresenter implements HogeContract.Presenter, HogeContract.InteractorOutput {

    private HogeViewModel viewModel = new HogeViewModel();

    private Activity activity;
    private HogeContract.View view;
    private HogeContract.Interactor interactor;
    private HogeContract.Router router;

    @Inject
    public HogePresenter(Activity activity,
                         HogeContract.View view,
                         HogeContract.Interactor interactor,
                         HogeContract.Router router) {
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

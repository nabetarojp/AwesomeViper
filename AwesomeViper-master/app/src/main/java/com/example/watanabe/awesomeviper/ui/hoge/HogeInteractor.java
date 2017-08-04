package com.example.watanabe.awesomeviper.ui.hoge;

import javax.inject.Inject;

import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;


public class HogeInteractor implements HogeContract.Interactor {

    private HogeContract.InteractorOutput out;
    private Disposable disposables = Disposables.empty();

    @Inject
    public HogeInteractor() {
        // add dependencies
    }

    @Override
    public void startInteraction(HogeContract.InteractorOutput out) {
        this.out = out;
    }

    @Override
    public void stopInteraction(HogeContract.InteractorOutput out) {
        this.disposables.dispose();
        this.out = null;
    }
}

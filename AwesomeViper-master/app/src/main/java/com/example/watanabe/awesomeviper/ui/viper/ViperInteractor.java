package com.example.watanabe.awesomeviper.ui.viper;

import javax.inject.Inject;

import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;


public class ViperInteractor implements ViperContract.Interactor {

    private ViperContract.InteractorOutput out;
    private Disposable disposables = Disposables.empty();

    @Inject
    public ViperInteractor() {
        // add dependencies
    }

    @Override
    public void startInteraction(ViperContract.InteractorOutput out) {
        this.out = out;
    }

    @Override
    public void stopInteraction(ViperContract.InteractorOutput out) {
        this.disposables.dispose();
        this.out = null;
    }
}

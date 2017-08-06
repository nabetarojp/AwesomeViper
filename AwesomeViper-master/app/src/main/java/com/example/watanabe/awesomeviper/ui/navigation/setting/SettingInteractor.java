package com.example.watanabe.awesomeviper.ui.navigation.setting;

import javax.inject.Inject;

import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;

/**
 * Created by watanabe on 2017/08/06.
 */

public class SettingInteractor implements SettingContract.Interactor {

    private SettingContract.InteractorOutput out;
    private Disposable disposables = Disposables.empty();

    @Inject
    public SettingInteractor() {
        // add dependencies
    }

    @Override
    public void startInteraction(SettingContract.InteractorOutput output) {
        this.out = output;
    }

    @Override
    public void stopInteraction(SettingContract.InteractorOutput output) {
        this.disposables.dispose();
        this.out = null;
    }
}

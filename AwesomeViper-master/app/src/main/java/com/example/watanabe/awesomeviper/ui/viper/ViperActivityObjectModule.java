package com.example.watanabe.awesomeviper.ui.viper;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;


@Module
public class ViperActivityObjectModule {

    private ViperContract.View view;

    public ViperActivityObjectModule(ViperContract.View view) {
        this.view = view;
    }

    @Provides
    public ViperContract.Presenter providePresenter(ViperInteractor interactor, ViperRouter router) {
        return new ViperPresenter((Activity) view, view, interactor, router);
    }
}

package com.example.watanabe.awesomeviper.ui.hoge;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;


@Module
public class HogeActivityObjectModule {

    private HogeContract.View view;

    public HogeActivityObjectModule(HogeContract.View view) {
        this.view = view;
    }

    @Provides
    public HogeContract.Presenter providePresenter(HogeInteractor interactor, HogeRouter router) {
        return new HogePresenter((Activity) view, view, interactor, router);
    }
}

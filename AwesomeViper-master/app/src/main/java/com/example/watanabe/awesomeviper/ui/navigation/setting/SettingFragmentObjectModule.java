package com.example.watanabe.awesomeviper.ui.navigation.setting;

import android.support.v4.app.Fragment;

import dagger.Module;
import dagger.Provides;

@Module
public class SettingFragmentObjectModule {

    private SettingContract.View view;

    public SettingFragmentObjectModule(SettingContract.View view) {
        this.view = view;
    }

    @Provides
    public SettingPresenter providePresenter(SettingInteractor interactor,
                                 SettingsRouter router) {
        return new SettingPresenter((Fragment) view, view, interactor, router);
    }
}

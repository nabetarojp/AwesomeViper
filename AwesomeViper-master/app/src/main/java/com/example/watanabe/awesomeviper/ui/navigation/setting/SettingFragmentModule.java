package com.example.watanabe.awesomeviper.ui.navigation.setting;

import android.support.v4.app.Fragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;


@Module(subcomponents = {SettingFragmentComponent.class})
public abstract class SettingFragmentModule {

    @Binds
    @IntoMap
    @FragmentKey(SettingFragment.class)
    public abstract AndroidInjector.Factory<? extends Fragment> bindSettingFragmentInjectorFactory(SettingFragmentComponent.Builder builder);
}

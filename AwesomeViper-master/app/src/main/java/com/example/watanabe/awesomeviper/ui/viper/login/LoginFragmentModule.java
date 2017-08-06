package com.example.watanabe.awesomeviper.ui.viper.login;

import android.support.v4.app.Fragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;


@Module(subcomponents = {LoginFragmentComponent.class})
public abstract class LoginFragmentModule {

    @Binds
    @IntoMap
    @FragmentKey(LoginFragment.class)
    public abstract AndroidInjector.Factory<? extends Fragment> bindLoginFragmentInjectorFactory(LoginFragmentComponent.Builder builder);
}

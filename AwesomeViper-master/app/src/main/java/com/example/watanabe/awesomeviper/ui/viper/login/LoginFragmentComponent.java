package com.example.watanabe.awesomeviper.ui.viper.login;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {LoginFragmentObjectModule.class})
public interface LoginFragmentComponent extends AndroidInjector<LoginFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<LoginFragment> {

        public abstract void objectModule(LoginFragmentObjectModule objectModule);

        @Override
        public void seedInstance(LoginFragment instance) {
            objectModule(new LoginFragmentObjectModule(instance));
        }
    }

}

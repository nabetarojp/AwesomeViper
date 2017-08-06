package com.example.watanabe.awesomeviper.ui.viper;

import com.example.watanabe.awesomeviper.ui.viper.login.LoginFragmentModule;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {
        ViperActivityObjectModule.class,
        LoginFragmentModule.class
})
public interface ViperActivityComponent extends AndroidInjector<ViperActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ViperActivity> {
        public abstract void objectModule(ViperActivityObjectModule objectModule);

        @Override
        public void seedInstance(ViperActivity instance) {
            objectModule(new ViperActivityObjectModule(instance));
        }
    }
}

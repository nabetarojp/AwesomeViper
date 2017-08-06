package com.example.watanabe.awesomeviper.ui.viper;


import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {ViperActivityComponent.class})
public abstract class ViperActivityModule {

    @Binds
    @IntoMap
    @ActivityKey(ViperActivity.class)
    public abstract AndroidInjector.Factory<? extends Activity> bindViperActivityInjectorFactory(ViperActivityComponent.Builder builder);
}

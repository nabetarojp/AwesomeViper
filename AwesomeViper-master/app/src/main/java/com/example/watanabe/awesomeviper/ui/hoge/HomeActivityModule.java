package com.example.watanabe.awesomeviper.ui.hoge;


import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {HogeActivityComponent.class})
public abstract class HomeActivityModule {

    @Binds
    @IntoMap
    @ActivityKey(HogeActivity.class)
    public abstract AndroidInjector.Factory<? extends Activity> bindHogeActivityInjectorFactory(HogeActivityComponent.Builder builder);
}

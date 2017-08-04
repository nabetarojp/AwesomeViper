package com.example.watanabe.awesomeviper;

import android.app.Activity;
import android.support.multidex.MultiDexApplication;

import com.example.watanabe.awesomeviper.di.AppComponent;
import com.example.watanabe.awesomeviper.di.AppModule;
import com.example.watanabe.awesomeviper.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasDispatchingActivityInjector;

/**
 * Created by watanabe on 2017/08/03.
 */

public class AwesomeApp extends MultiDexApplication implements HasDispatchingActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> activityInjector;

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .build();

        appComponent.inject(this);

    }

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return activityInjector;
    }
}

package com.example.watanabe.awesomeviper.di;

import com.example.watanabe.awesomeviper.AwesomeApp;
import com.example.watanabe.awesomeviper.data.source.task.TasksRepositoryModule;
import com.example.watanabe.awesomeviper.ui.hoge.HogeActivityModule;
import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by watanabe on 2017/08/03.
 */

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        HogeActivityModule.class,
        TasksRepositoryModule.class
})
public interface AppComponent {

    public void inject(AwesomeApp app);

    public void provideGson(Gson gson);
}

package com.example.watanabe.awesomeviper.data.source.task;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by watanabe on 2017/08/18.
 */
@Module
public class TasksRepositoryModule {

    private Context context;

    public TasksRepositoryModule(Context context) {
        this.context = context;
    }

    @Singleton
    @Provides
    public TasksDataSource provideTasksLocalDataSource() {
        return new TasksLocalDataSource();
    }

    @Singleton
    @Provides
    public TasksDataSource provideTasksRemoteDataSource() {
        return new TasksRemoteDataSource();
    }
}

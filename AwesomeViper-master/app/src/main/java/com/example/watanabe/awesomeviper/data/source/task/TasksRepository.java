package com.example.watanabe.awesomeviper.data.source.task;


import javax.inject.Inject;

public class TasksRepository implements TasksDataSource {

    private TasksDataSource localDataSource;
    private TasksDataSource remoteDataSource;

    @Inject
    public TasksRepository(TasksDataSource localDataSource, TasksDataSource remoteDataSource) {
        this.localDataSource = localDataSource;
        this.remoteDataSource = remoteDataSource;
    }
}

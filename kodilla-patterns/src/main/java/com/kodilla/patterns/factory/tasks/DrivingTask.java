package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    String taskName;
    String where;
    String using;
    boolean taskExecute;

    public DrivingTask(String taskName, String where, String using, boolean taskExecute) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.taskExecute = taskExecute;
    }

    @Override
    public String executeTask() {
        return "The task is processed";
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskExecute;
    }
}

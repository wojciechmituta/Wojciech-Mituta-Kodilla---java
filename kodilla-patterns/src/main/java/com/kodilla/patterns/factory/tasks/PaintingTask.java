package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean taskExecute;

    public PaintingTask(String taskName, String color, String whatToPaint, boolean taskExecute) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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

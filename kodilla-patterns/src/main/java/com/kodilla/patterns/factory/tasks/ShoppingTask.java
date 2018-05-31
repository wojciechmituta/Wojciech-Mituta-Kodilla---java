package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    private String taskName;
    private String whatToBuy;
    private double quantity;
    private boolean taskExecute;

    public ShoppingTask(String taskName, String whatToBuy, double quantity, boolean taskExecute) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
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

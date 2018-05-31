package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    String taskName;
    String whatToBuy;
    double quantity;
    boolean taskExecute;

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

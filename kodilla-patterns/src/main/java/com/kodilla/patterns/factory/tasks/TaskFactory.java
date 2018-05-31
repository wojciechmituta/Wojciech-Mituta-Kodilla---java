package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("shopping", "shoes", 1, true);
            case PAINTINGTASK:
                return new PaintingTask("painting", "blue", "circle", false);
            case DRIVINGTASK:
                return new DrivingTask("driving", "London", "car", true);
            default:
                return null;
        }
    }
}

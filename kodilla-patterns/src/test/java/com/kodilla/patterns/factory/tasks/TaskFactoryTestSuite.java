package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShoppingTask() {

        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("shopping", shoppingTask.getTaskName());
        Assert.assertEquals("The task is processed", shoppingTask.executeTask());
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {

        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals("painting", paintingTask.getTaskName());
        Assert.assertEquals("The task is processed", paintingTask.executeTask());
        Assert.assertEquals(false, paintingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask() {

        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);

        //Then
        Assert.assertEquals("driving", drivingTask.getTaskName());
        Assert.assertEquals("The task is processed", drivingTask.executeTask());
        Assert.assertEquals(true, drivingTask.isTaskExecuted());
    }
}

package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        TaskList task1 = (TaskList) context.getBean("createToDoList");
        TaskList task2 = (TaskList) context.getBean("createProgressList");
        TaskList task3 = (TaskList) context.getBean("createDoneList");
        //When
        board.getToDoList().tasks.add("work1");
        board.getInProgressList().tasks.add("work2");
        board.getDoneList().tasks.add("work3");

        //Then
        Assert.assertEquals(task1, board.getToDoList());
        Assert.assertEquals(task2, board.getInProgressList());
        Assert.assertEquals(task3, board.getDoneList());
    }
}

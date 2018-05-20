package com.kodilla.spring.portfolio;

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
        task1.tasks.add("work1");
        task2.tasks.add("work2");
        task3.tasks.add("work3");

        //Then
        System.out.println(board);
    }
}

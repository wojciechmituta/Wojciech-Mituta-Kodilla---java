package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean
    public Board createBoard() {
        return new Board(createToDoList(), createProgressList(), createDoneList());
    }

    @Bean
    public TaskList createToDoList() {
        return new TaskList();
    }

    @Bean
    public TaskList createProgressList() {
        return new TaskList();
    }

    @Bean
    public TaskList createDoneList() {
        return new TaskList();
    }
}
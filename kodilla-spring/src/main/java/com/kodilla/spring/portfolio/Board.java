package com.kodilla.spring.portfolio;

public class Board {
    public TaskList toDoList;
    public TaskList inProgressList;
    public TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    @Override
    public String toString() {
        return "Board{" +
                "toDoList=" + toDoList + "\n" +
                ", inProgressList=" + inProgressList + "\n" +
                ", doneList=" + doneList +
                '}';
    }
}

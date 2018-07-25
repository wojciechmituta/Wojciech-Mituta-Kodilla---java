package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class CourseTask implements Observable {
    private final List<StudentUser> students;
    private final List<Observer> observers;
    private final String name;

    public CourseTask(String name) {
        students = new ArrayList<>();
        observers = new ArrayList<>();
        this.name = name;
    }

    public void addStudent(StudentUser studentUser) {
        students.add(studentUser);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<StudentUser> getStudents() {
        return students;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public String getName() {
        return name;
    }
}

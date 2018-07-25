package com.kodilla.patterns2.observer.homework;

public class MentorUser implements Observer {
    private final String mentorName;
    private int updateCount;

    public MentorUser(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(CourseTask courseTask) {
        System.out.println(mentorName + ": new student finished his homework in task: " + courseTask.getName()
                + "\n" + "You have " + courseTask.getStudents().size() + " tasks to verify");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    public void setUpdateCount(int updateCount) {
        this.updateCount = updateCount;
    }
}

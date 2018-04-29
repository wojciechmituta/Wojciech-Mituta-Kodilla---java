package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;

public final class ForumUser {
    private final int userID;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPosts;
    private final LocalDate now = LocalDate.now();

    public ForumUser(int userID, String userName, char sex, LocalDate dateOfBirth, int numberOfPosts) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBrith=" + dateOfBirth +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }

    public int ageCalculator() {
        Period period = Period.between(dateOfBirth, now);
        return period.getYears();
    }
}

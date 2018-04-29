package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(001, "user1", 'M', LocalDate.of(2001, 6, 16), 21));
        theUserList.add(new ForumUser(002, "user2", 'F', LocalDate.of(1991, 1, 6), 105));
        theUserList.add(new ForumUser(003, "user3", 'M', LocalDate.of(1991, 2, 13), 100));
        theUserList.add(new ForumUser(004, "user4", 'M', LocalDate.of(1985, 3, 25), 10));
        theUserList.add(new ForumUser(005, "user5", 'F', LocalDate.of(1994, 5, 24), 256));
        theUserList.add(new ForumUser(006, "user6", 'F', LocalDate.of(1992, 6, 21), 106));
    }

    public List<ForumUser> getTheUserList() {
        return new ArrayList<>(theUserList);
    }
}

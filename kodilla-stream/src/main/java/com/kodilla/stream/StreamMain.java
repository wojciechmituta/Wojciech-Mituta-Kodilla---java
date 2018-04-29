package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> resultList = forum.getTheUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.ageCalculator() > 20)
                .filter(forumUser -> forumUser.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));
        System.out.println("# elements: " + resultList.size());
        resultList.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
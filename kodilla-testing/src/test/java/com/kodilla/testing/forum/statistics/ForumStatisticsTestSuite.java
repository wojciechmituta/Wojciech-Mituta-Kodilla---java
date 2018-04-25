package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ForumStatisticsTestSuite {
    @Test
    public void testCalculateNumberOfUsers() {
        //Given
        Statistics statNumberOfUsersMock = mock(Statistics.class);
        StatisticsForum statisticsForum = new StatisticsForum();
        int numberOfUsers = 100;
        List<String> usersNamesList = new ArrayList<>();
        for (int n = 1; n <= numberOfUsers; n++) {
            String userName = "user" + n;
            usersNamesList.add(userName);
        }

        int numberOfPosts = 10;
        int numberOfComments = 50;

        when(statNumberOfUsersMock.usersNames()).thenReturn(usersNamesList);
        when(statNumberOfUsersMock.commentsCount()).thenReturn(numberOfComments);
        when(statNumberOfUsersMock.postsCount()).thenReturn(numberOfPosts);
        //When
        statisticsForum.calculateAdvStatistics(statNumberOfUsersMock);
        statisticsForum.showStatistics();
        //Then
        if (numberOfPosts > 0) {
            Assert.assertEquals(numberOfComments / numberOfPosts, statisticsForum.getAverageCommentsToPosts(), 0);
        } else {
            System.out.print("No posts in the forum");
        }

        if (numberOfUsers > 0) {
            Assert.assertEquals(numberOfComments / numberOfUsers, statisticsForum.getAverageCommentsToUser(), 0);
            Assert.assertEquals(numberOfPosts / numberOfUsers, statisticsForum.getAveragePostsToUser(), 0);
        } else {
            System.out.print("No users in the forum");
        }

        Assert.assertEquals(numberOfUsers, statisticsForum.getNumberOfUsers());
        Assert.assertEquals(numberOfComments, statisticsForum.getNumberOfComments());
        Assert.assertEquals(numberOfPosts, statisticsForum.getNumberOfPosts());
    }
}



package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ForumStatisticsTestSuite {
    private static int testCounter = 0;

    @Before
    public void before() {
        testCounter++;
        System.out.println("\n" + "Test number: " + testCounter);
    }

    @Test
    public void testCheckNumberOfNamesCommentsAndPosts() {
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
        Assert.assertEquals(numberOfUsers, statisticsForum.getNumberOfUsers());
        Assert.assertEquals(numberOfComments, statisticsForum.getNumberOfComments());
        Assert.assertEquals(numberOfPosts, statisticsForum.getNumberOfPosts());
    }

    @Test
    public void testAveragePostsToUser() {
        //Given
        Statistics statNumberOfUsersMock = mock(Statistics.class);
        StatisticsForum statisticsForum = new StatisticsForum();
        int numberOfUsers = 0;
        List<String> usersNamesList = new ArrayList<>();
        for (int n = 1; n <= numberOfUsers; n++) {
            String userName = "user" + n;
            usersNamesList.add(userName);
        }

        int numberOfPosts = 10;

        when(statNumberOfUsersMock.usersNames()).thenReturn(usersNamesList);
        when(statNumberOfUsersMock.postsCount()).thenReturn(numberOfPosts);
        //When
        statisticsForum.calculateAdvStatistics(statNumberOfUsersMock);
        statisticsForum.showStatistics();
        //Then
        Assert.assertEquals(0, statisticsForum.getAveragePostsToUser(), 0);
    }

    @Test
    public void testAverageCommentsToUser() {
        //Given
        Statistics statNumberOfUsersMock = mock(Statistics.class);
        StatisticsForum statisticsForum = new StatisticsForum();
        int numberOfUsers = 1000;
        List<String> usersNamesList = new ArrayList<>();
        for (int n = 1; n <= numberOfUsers; n++) {
            String userName = "user" + n;
            usersNamesList.add(userName);
        }

        int numberOfComments = 500;

        when(statNumberOfUsersMock.usersNames()).thenReturn(usersNamesList);
        when(statNumberOfUsersMock.commentsCount()).thenReturn(numberOfComments);
        //When
        statisticsForum.calculateAdvStatistics(statNumberOfUsersMock);
        statisticsForum.showStatistics();
        //Then
        Assert.assertEquals(numberOfComments / numberOfUsers, statisticsForum.getAverageCommentsToUser(), 0);
    }

    @Test
    public void testAverageCommentsToPosts() {
        //Given
        Statistics statNumberOfUsersMock = mock(Statistics.class);
        StatisticsForum statisticsForum = new StatisticsForum();

        int numberOfPosts = 0;
        int numberOfComments = 50;

        when(statNumberOfUsersMock.commentsCount()).thenReturn(numberOfComments);
        when(statNumberOfUsersMock.postsCount()).thenReturn(numberOfPosts);
        //When
        statisticsForum.calculateAdvStatistics(statNumberOfUsersMock);
        statisticsForum.showStatistics();
        //Then
        Assert.assertEquals(0, statisticsForum.getAverageCommentsToPosts(), 0);
    }
}



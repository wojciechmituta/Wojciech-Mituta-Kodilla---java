package com.kodilla.testing.forum.statistics;


public class StatisticsForum {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averagePostsToUser;
    private double averageCommentsToUser;
    private double averageCommentsToPosts;

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if (numberOfUsers > 0) {
            averagePostsToUser = numberOfPosts / numberOfUsers;
            averageCommentsToUser = numberOfComments / numberOfUsers;
        } else {
            averagePostsToUser = 0;
            averageCommentsToUser = 0;
        }

        if (numberOfPosts > 0) {
            averageCommentsToPosts = numberOfComments / numberOfPosts;
        } else {
            averageCommentsToPosts = 0;
        }

    }


    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAveragePostsToUser() {
        return averagePostsToUser;
    }

    public double getAverageCommentsToUser() {
        return averageCommentsToUser;
    }

    public double getAverageCommentsToPosts() {
        return averageCommentsToPosts;
    }

    public void showStatistics() {
        System.out.println("Statistics:\n"
                + "User count = " + numberOfUsers + "\n"
                + "Post count = " + numberOfPosts + "\n"
                + "Comment count = " + numberOfComments + "\n"
                + "Average post count per user = " + averageCommentsToUser + "\n"
                + "Average comment count per user = " + averageCommentsToUser + "\n"
                + "Average comment count per post = " + averageCommentsToPosts);
    }
}




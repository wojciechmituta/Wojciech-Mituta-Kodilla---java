package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        //Given
        User adam = new Millenials("Adam");
        User krzysiek = new YGeneration("Krzysiek");
        User michal = new ZGeneration("Michal");

        //When
        String adamShare = adam.sharePost();
        System.out.println("Adam share post in: " + adamShare);
        String krzysiekShare = krzysiek.sharePost();
        System.out.println("Krzysiek share post in: " + krzysiekShare);
        String michalShare = michal.sharePost();
        System.out.println("Michal share post in: " + michalShare);

        //Then
        Assert.assertEquals("Facebook", adamShare);
        Assert.assertEquals("Twitter", krzysiekShare);
        Assert.assertEquals("Snapchat", michalShare);
    }

    @Test
    public void testIndividualSharingStrategy() {

        //Given
        User adam = new Millenials("Adam");

        //When
        String adamShare = adam.sharePost();
        System.out.println("Adam share post in: " + adamShare);
        adam.setShareMethod(new TwitterPublisher());
        adamShare = adam.sharePost();
        System.out.println("Adam share post in: " + adamShare);

        //Then
        Assert.assertEquals("Twitter", adamShare);
    }
}

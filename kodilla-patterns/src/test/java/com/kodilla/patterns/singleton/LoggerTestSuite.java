package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        Logger.getInstance().log("log1234");
        //When
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("log1234", result);
    }
}

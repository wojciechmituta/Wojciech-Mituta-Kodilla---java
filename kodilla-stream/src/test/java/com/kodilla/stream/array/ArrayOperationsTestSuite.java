package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {

        //Given
        int[] numbersToAverage = new int[]{3, 4, 3, 5, 3, 6, 7, 2, 5, 2, 7, 4, 2, 7, 4, 8, 2, 6, 4, 9};

        //When
        double average = ArrayOperations.getAverage(numbersToAverage);

        //Then
        Assert.assertEquals(4.65, average, 0);
    }
}

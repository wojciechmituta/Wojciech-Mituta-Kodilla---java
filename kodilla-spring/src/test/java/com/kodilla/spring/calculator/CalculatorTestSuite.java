package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest

public class CalculatorTestSuite {
    @Test
    public void testCalculations() {

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double returnAdd = calculator.add(4, 6);
        double returnDiv = calculator.div(8, 2);
        double returnMul = calculator.mul(2, 5);
        double returnSub = calculator.sub(10, 5);
        //Then
        Assert.assertEquals(10, returnAdd, 0.1);
        Assert.assertEquals(4, returnDiv, 0.1);
        Assert.assertEquals(10, returnMul, 0.1);
        Assert.assertEquals(5, returnSub, 0.1);
    }
}

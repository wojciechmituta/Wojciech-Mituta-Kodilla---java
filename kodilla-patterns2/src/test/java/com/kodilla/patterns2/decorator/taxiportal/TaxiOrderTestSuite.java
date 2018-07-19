package com.kodilla.patterns2.decorator.taxiportal;

import javafx.beans.binding.When;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class TaxiOrderTestSuite {
    @Test
    public void testBasicTaxiOrderGetCost(){
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        //When
        BigDecimal calculatedCost = taxiOrder.getCost();

        Assert.assertEquals(new BigDecimal(5), calculatedCost);

    }

    @Test
    public void testBasicTaxiOrderGetDescription(){
        //Given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        //When
        String description = taxiOrder.getDescription();


    }
}

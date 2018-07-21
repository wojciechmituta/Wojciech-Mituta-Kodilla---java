package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaOrderAdditionalCheeseHamMushroomsOlivesGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new AdditionalCheesePizzaDecorator(pizzaOrder);
        pizzaOrder = new HamPizzaDecorator(pizzaOrder);
        pizzaOrder = new MushroomsPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new OlivesPizzaDecorator(pizzaOrder);
        //When
        BigDecimal pizzaCost = pizzaOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(35), pizzaCost);
    }

    @Test
    public void testPizzaOrderAdditionalCheeseHamMushroomsOlivesGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new AdditionalCheesePizzaDecorator(pizzaOrder);
        pizzaOrder = new HamPizzaDecorator(pizzaOrder);
        pizzaOrder = new MushroomsPizzaOrderDecorator(pizzaOrder);
        pizzaOrder = new OlivesPizzaDecorator(pizzaOrder);
        //When
        String pizzaDescription = pizzaOrder.getDescription();
        //Then
        Assert.assertEquals("pizza + tomato sauce + cheese + additional cheese + ham + mushrooms + olives", pizzaDescription);
    }
}

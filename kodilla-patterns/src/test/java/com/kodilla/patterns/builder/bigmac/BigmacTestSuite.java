package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBurgerNew() {

        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("salata")
                .ingredient("cebula")
                .ingredient("papryka")
                .bun("zwykla")
                .burgers(2)
                .sauce("tysiac wysp")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        String bun = bigmac.getBun();
        int burgers = bigmac.getBurgers();
        //Then
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertEquals("zwykla", bun);
        Assert.assertEquals(2, burgers);


    }
}

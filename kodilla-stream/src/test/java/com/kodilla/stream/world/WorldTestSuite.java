package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class WorldTestSuite {
    @Test

    public void testGetPeopleQuantity() {
        //Then
        Country poland = new Country(new BigDecimal("100"));
        Country germany = new Country(new BigDecimal("100"));
        Country france = new Country(new BigDecimal("100"));
        Country japan = new Country(new BigDecimal("100"));
        Country china = new Country(new BigDecimal("100"));
        Country russia = new Country(new BigDecimal("100"));
        Country congo = new Country(new BigDecimal("100"));
        Country zambia = new Country(new BigDecimal("100"));
        Country zimbawe = new Country(new BigDecimal("100"));

        Set<Country> countryInEurope = new HashSet<>();
        countryInEurope.add(poland);
        countryInEurope.add(germany);
        countryInEurope.add(france);

        Set<Country> countryInAsia = new HashSet<>();
        countryInAsia.add(japan);
        countryInAsia.add(china);
        countryInAsia.add(russia);

        Set<Country> countryInAfrica = new HashSet<>();
        countryInAfrica.add(congo);
        countryInAfrica.add(zambia);
        countryInAfrica.add(zimbawe);

        Continent europa = new Continent(countryInEurope, "Europa");
        Continent asia = new Continent(countryInAsia, "Asia");
        Continent africa = new Continent(countryInAfrica, "Africa");

        Set<Continent> worldContinent = new HashSet<>();
        worldContinent.add(africa);
        worldContinent.add(asia);
        worldContinent.add(europa);

        //When
        World world = new World(worldContinent);
        BigDecimal numberOftotalPeople = world.getPeopleQuantity();

        //Then
        BigDecimal expextedPeople = new BigDecimal("900");
        Assert.assertEquals(expextedPeople, numberOftotalPeople);
    }
}

package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class World {
    private final Set<Continent> countries;

    public World(Set<Continent> countries) {
        this.countries = countries;
    }

    public BigDecimal getPeopleQuantity() {
        return countries.stream()
                .flatMap(continent -> continent.getCountries().stream()
                        .map(Country::getPeopleQuantity()
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));


    }


}





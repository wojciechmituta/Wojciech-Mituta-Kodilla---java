package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public final class World {
    private final Set<Continent> world;

    public World(Set<Continent> world) {
        this.world = world;
    }

    public BigDecimal getPeopleQuantity() {
        return world.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, ((sum, peopleQuantity) -> sum = sum.add(peopleQuantity)));
    }
}




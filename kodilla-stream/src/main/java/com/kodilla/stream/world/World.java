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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        World world1 = (World) o;
        return Objects.equals(world, world1.world);
    }

    @Override
    public int hashCode() {

        return Objects.hash(world);
    }
}




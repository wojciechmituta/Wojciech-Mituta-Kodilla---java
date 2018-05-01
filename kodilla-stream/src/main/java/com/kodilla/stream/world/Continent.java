package com.kodilla.stream.world;

import java.util.Objects;
import java.util.Set;

public final class Continent {

    private final Set<Country> countries;
    private final String name;

    public Continent(Set<Country> countries, String name) {
        this.countries = countries;
        this.name = name;
    }

    public Set<Country> getCountries() {
        return countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(countries, continent.countries) &&
                Objects.equals(name, continent.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(countries, name);
    }
}
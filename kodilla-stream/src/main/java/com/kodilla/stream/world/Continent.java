package com.kodilla.stream.world;

import java.util.Set;

public class Continent {

    private final Set<Country> countries;
    private final String name;

    public Continent(Set<Country> countries, String name) {
        this.countries = countries;
        this.name = name;
    }

    public Set<Country> getCountries() {
        return countries;
    }

}
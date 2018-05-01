package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {
    private final BigDecimal peopleQiantity;

    public Country(BigDecimal peopleQiantity) {
        this.peopleQiantity = peopleQiantity;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQiantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(peopleQiantity, country.peopleQiantity);
    }

    @Override
    public int hashCode() {

        return Objects.hash(peopleQiantity);
    }
}

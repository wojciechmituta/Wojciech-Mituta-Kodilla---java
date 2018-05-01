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


}

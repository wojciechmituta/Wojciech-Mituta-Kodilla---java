package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private BigDecimal peopleQiantity;

    public Country(BigDecimal peopleQiantity) {
        this.peopleQiantity = peopleQiantity;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQiantity;
    }

}

package com.kodilla.good.pattern.flights;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;


public class FlightRegister {
    ArrayList<Flight> flightsRegister;

    public FlightRegister() {
        flightsRegister = new ArrayList<>();
        flightsRegister.add(new Flight("Gdansk", "Warszawa"));
        flightsRegister.add(new Flight("Poznan", "Warszawa"));
        flightsRegister.add(new Flight("Zielona Gota", "Poznan"));
        flightsRegister.add(new Flight("Warszawa", "Szczecin"));
        flightsRegister.add(new Flight("Poznan", "Gdansk"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightRegister that = (FlightRegister) o;
        return Objects.equals(flightsRegister, that.flightsRegister);
    }

    @Override
    public int hashCode() {

        return Objects.hash(flightsRegister);
    }
}
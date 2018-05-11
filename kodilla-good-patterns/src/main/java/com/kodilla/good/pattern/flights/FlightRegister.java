package com.kodilla.good.pattern.flights;

import java.util.ArrayList;

public class FlightRegister {
    ArrayList<Flight> flightsRegister;

    public FlightRegister() {
        flightsRegister = new ArrayList<>();
        flightsRegister.add(new Flight("Warszawa", "Warszawa"));
        flightsRegister.add(new Flight("Poznan", "Warszawa"));
        flightsRegister.add(new Flight("Zielona Gota", "Poznan"));
        flightsRegister.add(new Flight("Warszawa", "Szczecin"));
        flightsRegister.add(new Flight("Warszawa", "Gdansk"));
        flightsRegister.add(new Flight("Zielona Gora", "Gdansk"));
    }
}
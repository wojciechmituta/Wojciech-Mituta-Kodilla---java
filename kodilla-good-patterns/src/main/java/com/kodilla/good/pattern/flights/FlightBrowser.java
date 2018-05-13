package com.kodilla.good.pattern.flights;

import java.util.stream.Collectors;

public class FlightBrowser {

    FlightRegister flightRegister = new FlightRegister();

    public Flight findFlightFrom(String cityOfDeparture) {
        Flight result = flightRegister.flightsRegister.stream()
                .filter(f -> f.getCityOfDeparture().equals(cityOfDeparture))
                .findAny().orElse(null);
        return result;
    }

    public Flight findFlightTo(String cityOfArrival) {
        Flight result = flightRegister.flightsRegister.stream()
                .filter(f -> f.getCityOfArrival().equals(cityOfArrival))
                .findAny().orElse(null);
        return result;
    }

    public String findFlightBy(String cityOfDeparture, String cityOfArrival, String cityOfChange) {
        String result = flightRegister.flightsRegister.stream()
                .filter(f -> (f.getCityOfArrival().equals(cityOfArrival)) || (f.getCityOfDeparture().equals(cityOfDeparture)))
                .filter(g -> (g.cityOfArrival.equals(cityOfChange)) || (g.cityOfDeparture.equals(cityOfChange)))
                .map(Flight::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));
        return result;
    }
}

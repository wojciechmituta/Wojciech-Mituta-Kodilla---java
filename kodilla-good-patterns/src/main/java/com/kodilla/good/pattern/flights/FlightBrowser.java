package com.kodilla.good.pattern.flights;

import java.util.stream.Collectors;

public class FlightBrowser {
    String CityOfDeparture;
    String CityOfArrival;
    String CityOfChange;

    FlightRegister flightRegister = new FlightRegister();

    public String findFlightTo(String CityOfDeparture) {
        String result = flightRegister.flightsRegister.stream()
                .filter(f -> f.getCityOfDeparture().equals(CityOfDeparture))
                .map(Flight::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));
        return result;
    }

    public String findFlightFrom(String CityOfArrival) {
        String result = flightRegister.flightsRegister.stream()
                .filter(f -> f.getCityOfArrival().equals(CityOfArrival))
                .map(Flight::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));
        return result;
    }

    public String FindFlightBy(String CityOfDeparture, String CityOfArrival, String CityOfChange) {
        String result = flightRegister.flightsRegister.stream()
                .filter(f -> (f.getCityOfArrival().equals(CityOfArrival)) || (f.getCityOfDeparture().equals(CityOfDeparture)))
                .filter(g -> (g.cityOfArrival.equals(CityOfChange)) || (g.cityOfDeparture.equals(CityOfChange)))
                .map(Flight::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));
        return result;
    }
}

package com.kodilla.good.pattern.flights;

import java.util.stream.Collectors;

public class FlightBrowser {
    String CityOfDeparture = "Poznan";
    String CityOfArrival = "Gdansk";
    String CityOfChange = "Warszawa";
    FlightRegister flightRegister = new FlightRegister();

    public void findFlightTo() {
        String result = flightRegister.flightsRegister.stream()
                .filter(f -> f.getCityOfDeparture().equals(CityOfDeparture))
                .map(Flight::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));
        System.out.println(result);
    }

    public void findFlightFrom() {
        String result = flightRegister.flightsRegister.stream()
                .filter(f -> f.getCityOfArrival().equals(CityOfArrival))
                .map(Flight::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));
        System.out.println(result);
    }

    public void FindFlightBy() {
        String result = flightRegister.flightsRegister.stream()
                .filter(f -> (f.getCityOfArrival().equals(CityOfArrival)) || (f.getCityOfDeparture().equals(CityOfDeparture)))
                .filter(g -> g.cityOfArrival.equals(CityOfChange) || g.cityOfDeparture.equals(CityOfChange))
                .map(Flight::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));
        System.out.println(result);
    }

    public static void main(String args[]) {
        FlightBrowser flightBrowser = new FlightBrowser();
        flightBrowser.findFlightFrom();
        flightBrowser.findFlightTo();
        flightBrowser.FindFlightBy();
    }
}

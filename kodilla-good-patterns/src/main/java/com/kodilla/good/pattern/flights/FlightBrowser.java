package com.kodilla.good.pattern.flights;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightBrowser {
    String getCityOfArrival = "Gdansk";
    String getCityOfDeparture = "Warszawa";
    String getCityOfChange = "Poznan";
    FlightRegister flightRegister = new FlightRegister();


    public void findFlightTo() {
        String result = flightRegister.flightsRegister.stream()
                .filter(f -> f.getCityOfDeparture().equals(getCityOfDeparture))
                .map(Flight::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));
        System.out.println(result);
    }

    public void findFlightFrom() {
        String result = flightRegister.flightsRegister.stream()
                .filter(f -> f.getCityOfArrival().equals(getCityOfArrival))
                .map(Flight::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));
        System.out.println(result);
    }

    public static void main(String args[]) {
        FlightBrowser flightBrowser = new FlightBrowser();
        flightBrowser.findFlightFrom();
        //  flightBrowser.findFlightTo();


    }
}

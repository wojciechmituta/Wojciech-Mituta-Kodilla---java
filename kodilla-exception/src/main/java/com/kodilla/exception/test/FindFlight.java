package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    private Map<String, Boolean> airPortList = new HashMap<>();

    public FindFlight() {

        airPortList.put("Berlin", true);
        airPortList.put("Warszawa", true);
        airPortList.put("Londyn", false);
        airPortList.put("Frankfurt", true);
        airPortList.put("Paryz", true);
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        if (!airPortList.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("the airport does not exist");
        }
        return airPortList.get(flight.getArrivalAirport());
    }

    public static void main(String args[]) {

        Flight flight = new Flight("asdaff", "Lndyn");
        FindFlight findFlight = new FindFlight();

        try {
            boolean possible = findFlight.findFlight(flight);
            System.out.println(possible ? "Flight is possible " : "Flight is impossible");
        } catch (RouteNotFoundException e) {
            System.out.println("Not found flight to : " + flight.getArrivalAirport()  + "\n" + e);
        }
    }
}

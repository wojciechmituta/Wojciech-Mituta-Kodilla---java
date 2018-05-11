package com.kodilla.good.pattern.flights;

import java.util.Objects;

public class Flight {
    String cityOfDeparture;
    String cityOfArrival;

    public Flight(String cityOfDeparture, String cityOfArrival) {
        this.cityOfDeparture = cityOfDeparture;
        this.cityOfArrival = cityOfArrival;
    }

    public String getCityOfDeparture() {
        return cityOfDeparture;
    }

    public String getCityOfArrival() {
        return cityOfArrival;
    }

    @Override
    public String toString() {
        return "Flight" +
                " from: " + cityOfDeparture + '\'' +
                " to: " + cityOfArrival + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(cityOfDeparture, flight.cityOfDeparture) &&
                Objects.equals(cityOfArrival, flight.cityOfArrival);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cityOfDeparture, cityOfArrival);
    }
}

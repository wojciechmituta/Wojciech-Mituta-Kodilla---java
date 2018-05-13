package Flights;

import com.kodilla.good.pattern.flights.Flight;
import com.kodilla.good.pattern.flights.FlightBrowser;
import org.junit.Assert;
import org.junit.Test;

public class FlightsTestSuite {

    @Test
    public void testFlightTo() {

        //Given
        FlightBrowser flightBrowser = new FlightBrowser();
        //When
        Flight result = flightBrowser.findFlightTo("Poznan");
        //Then
        Assert.assertEquals("Poznan", result.getCityOfArrival());
        Assert.assertEquals("Zielona Gora", result.getCityOfDeparture());
    }

    @Test
    public void testFlightFrom() {

        //Given
        FlightBrowser flightBrowser = new FlightBrowser();
        //When
        Flight result = flightBrowser.findFlightFrom("Warszawa");
        //Then
        Assert.assertEquals("Warszawa", result.getCityOfDeparture());
        Assert.assertEquals("Poznan", result.getCityOfArrival());
    }

    @Test
    public void testFlightBy() {

        //Given
        FlightBrowser flightBrowser = new FlightBrowser();
        //When
        String result = flightBrowser.findFlightBy("Poznan", "Gdansk", "Warszawa");
        //Then
        Assert.assertEquals("<<Flight from: Poznan' to: Warszawa',\n" +
                "Flight from: Warszawa' to: Gdansk'>>", result);
    }
}

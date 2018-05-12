package Flights;

import com.kodilla.good.pattern.flights.FlightBrowser;
import org.junit.Assert;
import org.junit.Test;

public class FlightsTestSuite {

    @Test
    public void testFlightTo() {

        //Given
        FlightBrowser flightBrowser = new FlightBrowser();
        //When
        String result = flightBrowser.findFlightTo("Poznan");
        //Then
        Assert.assertEquals("<<Flight from: Poznan' to: Warszawa'>>", result);
    }

    @Test
    public void testFlightFrom() {

        //Given
        FlightBrowser flightBrowser = new FlightBrowser();
        //When
        String result = flightBrowser.findFlightFrom("Gdansk");
        //Then
        Assert.assertEquals("<<Flight from: Warszawa' to: Gdansk',\n" +
                "Flight from: Zielona Gora' to: Gdansk'>>", result);
    }

    @Test
    public void testFlightBy() {

        //Given
        FlightBrowser flightBrowser = new FlightBrowser();
        //When
        String result = flightBrowser.FindFlightBy("Poznan", "Gdansk", "Warszawa");
        //Then
        Assert.assertEquals("<<Flight from: Poznan' to: Warszawa',\n" +
                "Flight from: Warszawa' to: Gdansk'>>", result);
    }
}

/**
 * EPAM JavaTraining-Intro. Task 4.
 * UNIT-TEST
 *
 * @author Natallia Bialiatskaya
 * @version 1.0
 * @since 17.08.2019
 */
package by.epam.javatraining.bialiatskaya.tests.mainTask04;

import by.epam.javatraining.bialiatskaya.tasks.mainTask04.exceptions.DurationException;
import by.epam.javatraining.bialiatskaya.tasks.mainTask04.validation.TravelValidator;
import org.junit.Test;

import static org.junit.Assert.*;

public class TravelTest {

    private static final int CITIES_FROM = 0;
    private static final int CITIES_TO = 30;

    // Good travel
    String travelGood = "ADVENTURE";
    String transportGood = "BY_TRAIN";
    String cateringGood = "ALL_INCLUSIVE";
    int durationGood = 10;
    String departureGood = "MENSK";
    String destinationGood = "VILNYA";
    int quantityOfCitiesGood = 7;
    // bad travel
    String travelBad = "ADVENTURE";
    String transportBad = "BY_TRAIN";
    String cateringBad = "ALL_INCLUSIVE";
    int durationBad = 80;
    String departureBad = "MENSK";
    String destinationBad = "VILNYA";
    int quantityOfCitiesBad = -7;

    @Test
    public void createGoodTravel() {
        boolean actual = TravelValidator.isTravel(travelGood, transportGood, cateringGood, durationGood,
                departureGood, destinationGood);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test   // bad travelType
    public void createBadTravelType() {
        boolean actual = TravelValidator.isTravel(travelBad, transportGood, cateringGood, durationGood,
                departureGood, destinationGood);
        boolean unexpected = false;
        assertNotEquals(unexpected, actual);
    }

    @Test   // bad transporType
    public void createBadTransportType() {
        boolean actual = TravelValidator.isTravel(travelGood, transportBad, cateringGood, durationGood,
                departureGood, destinationGood);
        boolean unexpected = false;
        assertNotEquals(unexpected, actual);
    }

    @Test   // bad cateringType
    public void createBadCateringType() {
        boolean actual = TravelValidator.isTravel(travelGood, transportGood, cateringBad, durationGood,
                departureGood, destinationGood);
        boolean unexpected = false;
        assertNotEquals(unexpected, actual);
    }

    @Test   // bad duration
    public void createBadDuration() throws DurationException {
        boolean actual = TravelValidator.isTravel(travelGood, transportBad, cateringGood, durationBad,
                departureGood, destinationGood);
        boolean unexpected = true;
        assertNotEquals(unexpected, actual);
    }

    @Test   // bad departure
    public void createBadDeparture() {
        boolean actual = TravelValidator.isTravel(travelGood, transportBad, cateringGood, durationGood,
                departureBad, destinationGood);
        boolean unexpected = false;
        assertNotEquals(unexpected, actual);
    }

    @Test   // bad destination
    public void createBadDestination() {
        boolean actual = TravelValidator.isTravel(travelGood, transportBad, cateringGood, durationGood,
                departureGood, destinationGood);
        boolean unexpected = false;
        assertNotEquals(unexpected, actual);
    }

    @Test   // good quantityOfCities
    public void createGoodQuantityOfCities()  throws DurationException{
        boolean actual = TravelValidator.isExceptionInt(quantityOfCitiesGood, "quantityOfCities",
                CITIES_FROM, CITIES_TO);
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test   // bad quantityOfCities
    public void createBadQuantityOfCities()  throws DurationException{
        boolean actual = TravelValidator.isExceptionInt(quantityOfCitiesBad, "quantityOfCities",
                CITIES_FROM, CITIES_TO);
        boolean unexpected = false;
        assertNotEquals(unexpected, actual);
    }
}

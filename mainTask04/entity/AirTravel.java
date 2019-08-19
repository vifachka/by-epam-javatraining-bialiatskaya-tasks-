/**
 * EPAM JavaTraining-Intro. Task 4.
 * Excurtions
 *
 * @author Natallia Bialiatskaya
 * @version 1.0
 * @since 07.08.2019
 */
package by.epam.javatraining.bialiatskaya.tasks.mainTask04.entity;

public class AirTravel extends Travel{
    private int numberOfTransfers = 0;
    private double flightDuration = 0;

    public AirTravel(String travel, String transport, String catering, int duration, String departure,
                     String destination, int numberOfTransfers, double flightDuration) {
        super(travel, transport, catering, duration, departure, destination);

        this.numberOfTransfers = numberOfTransfers;
        this.flightDuration = flightDuration;
    }
}

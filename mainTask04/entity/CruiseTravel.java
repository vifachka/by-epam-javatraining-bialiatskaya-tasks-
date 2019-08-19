/**
 * EPAM JavaTraining-Intro. Task 4.
 * Excurtions
 *
 * @author Natallia Bialiatskaya
 * @version 1.0
 * @since 07.08.2019
 */
package by.epam.javatraining.bialiatskaya.tasks.mainTask04.entity;

public class CruiseTravel extends Travel{
    private boolean doesStops = true;

    public CruiseTravel(String travel, String transport, String catering, int duration, String departure,
                        String destination, boolean doesStops) {
        super(travel, transport, catering, duration, departure, destination);

        this.doesStops = doesStops;
    }
}

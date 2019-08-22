/**
 * EPAM JavaTraining-Intro. Task 4.
 * General travels - all the rest travels
 *
 * @author Natallia Bialiatskaya
 * @version 1.0
 * @since 07.08.2019
 */
package by.epam.javatraining.bialiatskaya.tasks.mainTask04.entity;

import by.epam.javatraining.bialiatskaya.tasks.mainTask04.enums.*;

public class GeneralTravel extends Travel {

    public GeneralTravel(TravelType travel, TransportType transport, CateringType catering, int duration,
                         City departure, City destination) {

        super(travel, transport, catering, duration, departure, destination);
    }
}

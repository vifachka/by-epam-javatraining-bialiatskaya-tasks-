/**
 * EPAM JavaTraining-Intro. Task 4.
 * Excurtions and cruises
 *
 * @author Natallia Bialiatskaya
 * @version 1.0
 * @since 07.08.2019
 */
package by.epam.javatraining.bialiatskaya.tasks.mainTask04.entity;

import by.epam.javatraining.bialiatskaya.tasks.mainTask04.enums.*;

public class ExcursionTravel extends Travel{
    private int quantityOfCities;

    public ExcursionTravel(TravelType travel, TransportType transport, CateringType catering, int duration,
                           City departure, City destination, int quantityOfCities) {

        super(travel, transport, catering, duration, departure, destination);

        this.quantityOfCities = quantityOfCities;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString() + '\'' +
                ", quantityOfCities='" + quantityOfCities + ".";
    }
}

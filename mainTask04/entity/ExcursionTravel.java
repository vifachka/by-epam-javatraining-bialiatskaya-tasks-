/**
 * EPAM JavaTraining-Intro. Task 4.
 * Excurtions
 *
 * @author Natallia Bialiatskaya
 * @version 1.0
 * @since 07.08.2019
 */
package by.epam.javatraining.bialiatskaya.tasks.mainTask04.entity;

import by.epam.javatraining.bialiatskaya.tasks.mainTask04.entity.Travel;

public class ExcursionTravel extends Travel{
    private int quantityOfCities = 0;

    public ExcursionTravel(String travel, String transport, String catering, int duration, String departure,
                           String destination, int quantityOfCities) {
        super(travel, transport, catering, duration, departure, destination);

        this.quantityOfCities = quantityOfCities;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return 1000;
    }

    // to remake
    @Override
    public String toString() {
        return "Travel{" +"";
//                "travel='" + travel + '\'' +
//                ", transport='" + transport + '\'' +
//                ", catering='" + catering + '\'' +
//                ", duration=" + duration +
//                ", departure='" + departure + '\'' +
//                ", destination='" + destination + '\'' +
//                '}';
    }
}

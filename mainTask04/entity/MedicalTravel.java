/**
 * EPAM JavaTraining-Intro. Task 4.
 * Travels for medical purposes
 *
 * @author Natallia Bialiatskaya
 * @version 1.0
 * @since 07.08.2019
 */
package by.epam.javatraining.bialiatskaya.tasks.mainTask04.entity;

import by.epam.javatraining.bialiatskaya.tasks.mainTask04.enums.*;

public class MedicalTravel extends Travel{

    private String desease;

    public MedicalTravel(TravelType travel, TransportType transport, CateringType catering, int duration,
                         City departure, City destination, String desease) {

        super(travel, transport, catering, duration, departure, destination);

        this.desease = desease;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString() + '\'' +
                ", desease='" + desease + ".";
    }
}

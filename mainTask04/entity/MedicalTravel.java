/**
 * EPAM JavaTraining-Intro. Task 4.
 * Excurtions
 *
 * @author Natallia Bialiatskaya
 * @version 1.0
 * @since 07.08.2019
 */
package by.epam.javatraining.bialiatskaya.tasks.mainTask04.entity;

public class MedicalTravel extends Travel{
    private String desease = "";

    public MedicalTravel(String travel, String transport, String catering, int duration, String departure,
                         String destination, String desease) {
        super(travel, transport, catering, duration, departure, destination);

        this.desease = desease;
    }
}

/**
 * EPAM JavaTraining-Intro. Task 4.
 * Enum to store types of travel
 *
 * @author Natallia Bialiatskaya
 * @version 1.0
 * @since 07.08.2019
 */
package by.epam.javatraining.bialiatskaya.tasks.mainTask04.enums;

public enum TravelType {
    EXCURSION        ("Excursion"),
    MEDICAL_TOURIZM  ("Medical tourizm"),
    SHOPPING         ("Shopping"),
    VACATION         ("Vacation"),
    CRUISE           ("Cruise"),
    ADVENTURE        ("Adventure"),
    BUSINESS_TOURIZM ("Business tourizm"),
    HONEYMOON        ("Honeymoon");

    private String travelName;

    private TravelType(String travelName) {
        this.travelName = travelName;
    }
}

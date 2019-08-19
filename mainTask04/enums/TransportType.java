/**
 * EPAM JavaTraining-Intro. Task 4.
 * Enum to store types of transport for travelling
 *
 * @author Natallia Bialiatskaya
 * @version 1.0
 * @since 07.08.2019
 */
package by.epam.javatraining.bialiatskaya.tasks.mainTask04.enums;

public enum TransportType {
    BY_BUS          ("by bus"),
    BY_CAR          ("by car"),
    BY_TRAIN        ("by train"),
    BY_PLANE        ("by plane"),
    BY_MARINE_LINER ("by marine liner"),
    ON_FOOT         ("on foot");

    private String transportName;

    private TransportType(String transportName) {
        this.transportName = transportName;
    }
}

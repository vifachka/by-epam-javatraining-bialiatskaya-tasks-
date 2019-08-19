/**
 * EPAM JavaTraining-Intro. Task 4.
 * Enum to store points of departure
 *
 * @author Natallia Bialiatskaya
 * @version 1.0
 * @since 07.08.2019
 */
package by.epam.javatraining.bialiatskaya.tasks.mainTask04.enums;

public enum DeparturePoint {
    MENSK    ("Mensk"),
    GARODNYA ("Garodnya"),
    MAHILEU  ("Mahileu"),
    KIEU     ("Kieu"),
    MASKWA   ("Maskwa"),
    VILNYA   ("Vilnya"),
    WARSHAWA ("Warshawa"),
    RYGA     ("Ryga"),
    TALIN    ("Talin"),
    STAKHOLM ("Stakholm"),
    BARYSAU  ("Barysau");

    private String departureName;

    private DeparturePoint(String departureName) {
        this.departureName = departureName;
    }
}

/**
 * EPAM JavaTraining-Intro. Task 4.
 * Enum to store points of destination
 *
 * @author Natallia Bialiatskaya
 * @version 1.0
 * @since 07.08.2019
 */
package by.epam.javatraining.bialiatskaya.tasks.mainTask04.enums;

public enum DestinationPoint {
    PORTO       ("Porto"),
    MILAN       ("Milan"),
    BARSELONA   ("Barselona"),
    KIEU        ("Kieu"),
    MASKWA      ("Maskwa"),
    VILNYA      ("Vilnya"),
    WARSHAWA    ("Warshawa"),
    RYGA        ("Ryga"),
    BARYSAU     ("Barysau"),
    ZHODZINA    ("Zhodzina"),
    VITSEBSK    ("Vitsebsk"),
    PARIS       ("Paris"),
    BERLIN      ("Berlin"),
    PRAHA       ("Praha"),
    MADRYD      ("Madryd"),
    LONDAN      ("Londan"),
    TALIN       ("Talin"),
    HELSINKI    ("Helsinki"),
    GOMEL       ("Gomel"),
    KAZAN       ("Kazan"),
    BRATSISLAVA ("Bratsislava"),
    ZASLAUE     ("Zaslaue");

    private String destinationName;

    private DestinationPoint(String destinationName) {
        this.destinationName = destinationName;
    }
}

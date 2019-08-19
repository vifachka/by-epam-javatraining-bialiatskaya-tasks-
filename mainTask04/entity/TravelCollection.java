/**
 * EPAM JavaTraining-Intro. Task 4.
 * Mechanizm to add one travel to travel collection
 *
 * @author Natallia Bialiatskaya
 * @version 1.0
 * @since 07.08.2019
 */
package by.epam.javatraining.bialiatskaya.tasks.mainTask04.entity;

import java.util.ArrayList;

public class TravelCollection {
    private ArrayList<Travel> travelList;

    public TravelCollection() {
        travelList = new ArrayList<Travel>();
    }

    public void addTravel(Travel oneTravel) {
        travelList.add(oneTravel);
    }
}

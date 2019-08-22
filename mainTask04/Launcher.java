/**
 * EPAM JavaTraining-Intro. Task 4.
 * Launcher
 *
 * @author Natallia Bialiatskaya
 * @version 1.0
 * @since 07.08.2019
 */
package by.epam.javatraining.bialiatskaya.tasks.mainTask04;

import by.epam.javatraining.bialiatskaya.tasks.mainTask04.actions.FillTravelCollection;
import by.epam.javatraining.bialiatskaya.tasks.mainTask04.entity.TravelCollection;

import java.io.File;

public class Launcher {

    public static final String FILE_PATH = "c:\\Users\\user\\IdeaProjects\\Training\\src\\by\\epam\\javatraining\\bialiatskaya\\tasks\\mainTask04\\Data.txt";

    public static void main( String[] args ) {

        TravelCollection oneTravel = new TravelCollection();
        File file = new File(FILE_PATH);
        FillTravelCollection fillTravelCollection = new FillTravelCollection(file, oneTravel);
        fillTravelCollection.fill();

    }

}

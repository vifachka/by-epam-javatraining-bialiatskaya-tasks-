/**
 * EPAM JavaTraining-Intro. Task 4.
 * main class - dream to do it interactive
 *
 * @author Natallia Bialiatskaya
 * @version 1.0
 * @since 07.08.2019
 */
package by.epam.javatraining.bialiatskaya.tasks.mainTask04;

import by.epam.javatraining.bialiatskaya.tasks.mainTask04.actions.FillTravelCollection;
import by.epam.javatraining.bialiatskaya.tasks.mainTask04.entity.TravelCollection;
import org.apache.log4j.Logger;

import java.io.File;
import java.util.Scanner;

public class MainTask04 {

    private static final Logger log = Logger.getLogger(MainTask04.class);
//    public static final String FILE_PATH = "./Data.txt";
    public static final String FILE_PATH = "c:\\Users\\user\\IdeaProjects\\Training\\src\\by\\epam\\javatraining\\bialiatskaya\\tasks\\mainTask04\\Data.txt";

    private static void chooseAndRun() {
        Scanner reader = new Scanner(System.in).useDelimiter("\n");
        int inputNumber;

        try {
            do {
                System.out.println("WELCOME!");
                System.out.println("We'll do our best to find the most suitable tour for you!");
                System.out.println("1. Fill the collection, 0. Exit");

                inputNumber = reader.nextInt();
                TravelCollection oneTravel = new TravelCollection();

                switch (inputNumber) {
                    case 1: {
                        File file = new File(FILE_PATH);
                        FillTravelCollection fillTravelCollection = new FillTravelCollection(file, oneTravel);
                        fillTravelCollection.fill();
                        break;
                    }
                    case 0: {
                        System.out.println("We were glad to see you, come again! Bye!");
                        break;
                    }
                    default: {
                        System.out.println("Bad number, try again later.");
                        break;
                    }
                }
            } while (inputNumber > 0 && inputNumber < 2);
        } catch (NullPointerException e) {
            log.error("Null pointer!");
//        } catch (IOException e) {
//            log.error("File is not found!");
        } finally {
            reader.close();
        }
    }

    public static void main(String[] args) {
        chooseAndRun();
    }
}


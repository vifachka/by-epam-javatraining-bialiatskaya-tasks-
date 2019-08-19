/**
 * EPAM JavaTraining-Intro. Task 4.
 * ACTION: scan file and fill up the travel collection
 *
 * @author Natallia Bialiatskaya
 * @version 1.0
 * @since 07.08.2019
 */
package by.epam.javatraining.bialiatskaya.tasks.mainTask04.actions;

import by.epam.javatraining.bialiatskaya.tasks.mainTask04.entity.*;
import by.epam.javatraining.bialiatskaya.tasks.mainTask04.enums.TransportType;
import by.epam.javatraining.bialiatskaya.tasks.mainTask04.enums.TravelType;
import by.epam.javatraining.bialiatskaya.tasks.mainTask04.validation.TravelValidator;
import org.apache.log4j.Logger;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;

public class FillTravelCollection {

    private static final Logger log = Logger.getLogger(FillTravelCollection.class);

    public static void fillTravelCollection(File file, TravelCollection oneTravel) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            scanner.useDelimiter(" ");

            while (scanner.hasNext()) {
                String travel = scanner.next();
                String transport = scanner.next();
                String catering = scanner.next();
                int    duration = scanner.nextInt();
                String departure = scanner.next();
                String destination = scanner.next();

                if (TravelValidator.isTravel(travel, transport, catering, duration, departure, destination)) {
                    switch (TravelType.valueOf(travel)) {
                        case EXCURSION:
                            int quantityOfCities = scanner.nextInt();
                            oneTravel.addTravel(new ExcursionTravel(travel, transport, catering, duration, departure,
                                    destination, quantityOfCities));
                            log.info("One item 'ExcursionTravel' was added");
                            break;
                        case MEDICAL_TOURIZM:
                            String desease = scanner.next();
                            oneTravel.addTravel(new MedicalTravel(travel, transport, catering, duration, departure,
                                    destination, desease));
                            log.info("One item 'MedicalTravel' was added");
                            break;
                        default:
                            switch (TransportType.valueOf(transport)) {
                                case BY_MARINE_LINER:
                                    boolean doesStops = scanner.hasNextBoolean();
                                    oneTravel.addTravel(new CruiseTravel(travel, transport, catering, duration,
                                            departure, destination, doesStops));
                                    log.info("One item 'CruiseTravel' was added");
                                    break;
                                case  BY_PLANE:
                                    int numberOfTransfers = scanner.nextInt();
                                    double flightDuration = scanner.nextDouble();
                                    oneTravel.addTravel(new AirTravel(travel, transport, catering, duration, departure,
                                            destination, numberOfTransfers, flightDuration));
                                    log.info("One item 'AirTravel' was added");
                                    break;
                                default:
                                    oneTravel.addTravel(new GeneralTravel(travel, transport, catering, duration,
                                            departure, destination));
                                    log.info("One item 'GeneralTravel' was added");
                                    break;
                            }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            log.error("File is not found. Check if the file exists.");
            e.printStackTrace();
        } catch (IOException e) {
            log.error("File could not be opened.");
            e.printStackTrace();
        } catch (Exception e) {
            log.error("Something have been gone in a wrong way!");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

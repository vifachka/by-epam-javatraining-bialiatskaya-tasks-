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
import java.util.regex.Pattern;

public class FillTravelCollection {

    private static final Logger log = Logger.getLogger(FillTravelCollection.class);

    public FillTravelCollection(File file) {
        Scanner scanner = null;
        TravelCollection oneTravel = null;

        try {
            scanner = new Scanner(file);
//            scanner.useDelimiter(" ");

            while (scanner.hasNext()) {
                String travel = scanner.next();
                String transport = scanner.next();
                String catering = scanner.next();
                int duration = scanner.nextInt();
                String departure = scanner.next();
                String destination = scanner.next();

                if (TravelValidator.isTravel(travel, transport, catering, duration, departure, destination)) {
                    oneTravel = new TravelCollection();

                    switch (TravelType.valueOf(travel)) {
                        case EXCURSION:
                            oneTravel.addTravel(new GeneralTravel(travel, transport, catering, duration, departure,
                                    destination));
//                            scanner.useDelimiter("");
//                            int quantityOfCities = scanner.nextInt();
//                            oneTravel.addTravel(new ExcursionTravel(travel, transport, catering, duration, departure,
//                                    destination, quantityOfCities));
                            log.info("One item 'ExcursionTravel' was added");
                            break;
                        case MEDICAL_TOURIZM:
                            oneTravel.addTravel(new GeneralTravel(travel, transport, catering, duration, departure,
                                    destination));
//                            String desease = scanner.next();
//                            oneTravel.addTravel(new MedicalTravel(travel, transport, catering, duration, departure,
//                                    destination, desease));
                            log.info("One item 'MedicalTravel' was added");
                            break;
                        default:
                            switch (TransportType.valueOf(transport)) {
                                case BY_MARINE_LINER:
                                    oneTravel.addTravel(new GeneralTravel(travel, transport, catering, duration, departure,
                                            destination));
//                                    boolean doesStops = scanner.hasNextBoolean();
//                                    oneTravel.addTravel(new CruiseTravel(travel, transport, catering, duration,
//                                            departure, destination, doesStops));
                                    log.info("One item 'CruiseTravel' was added");
                                    break;
                                case BY_PLANE:
                                    oneTravel.addTravel(new GeneralTravel(travel, transport, catering, duration, departure,
                                            destination));
//                                    int numberOfTransfers = scanner.nextInt();
//                                    double flightDuration = scanner.nextDouble();
//                                    oneTravel.addTravel(new AirTravel(travel, transport, catering, duration, departure,
//                                            destination, numberOfTransfers, flightDuration));
                                    log.info("One item 'AirTravel' was added");
                                    break;
                                default:
                                    oneTravel.addTravel(new GeneralTravel(travel, transport, catering, duration, departure,
                                            destination));
//                                    oneTravel.addTravel(new GeneralTravel(travel, transport, catering, duration,
//                                            departure, destination));
                                    log.info("One item 'GeneralTravel' was added");
                                    break;
                            }
                    }
                }
            }
        } catch (NullPointerException e) {
            log.error("Ho-ho-ho! Null pointer exception is thrown!");
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            log.error("Unable to fill collection. File is not found.");
            e.printStackTrace();
        } catch (Exception e) {
            log.error("Exception during filling. Something have been gone in a wrong way!");
            e.printStackTrace();
        } finally {
            log.info("Collection is filled up. You can start the selection of the tour.");
            scanner.close();
        }
    }
}

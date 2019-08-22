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
import by.epam.javatraining.bialiatskaya.tasks.mainTask04.enums.*;
import by.epam.javatraining.bialiatskaya.tasks.mainTask04.validation.TravelValidator;
import org.apache.log4j.Logger;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FillTravelCollection {

    private static final Logger log = Logger.getLogger(FillTravelCollection.class);
    private static final int CITIES_FROM = 0;
    private static final int CITIES_TO = 30;

    private Scanner scanner;
    private TravelCollection oneTravel;
    private File file;
    private int counter;

    public FillTravelCollection(File file, TravelCollection oneTravel) {

        this.oneTravel = oneTravel;
        this.file = file;

    }

    public void fill() {
        try {
            scanner = new Scanner(file);
            TravelValidator travelValidator = new TravelValidator();
            counter = 0;
//            scanner.useDelimiter(" ");

            while (scanner.hasNext()) {

                String travel = scanner.next();
                String transport = scanner.next();
                String catering = scanner.next();
                int duration = scanner.nextInt();
                String departure = scanner.next();
                String destination = scanner.next();

                if (travelValidator.isTravel(travel, transport, catering, duration, departure, destination)) {

                    TravelType travelType = TravelType.valueOf(travel);
                    TransportType transportType = TransportType.valueOf(transport);
                    CateringType cateringType = CateringType.valueOf(catering);
                    City departurePoint = City.valueOf(departure);
                    City destinationPoint = City.valueOf(destination);

                    switch (TravelType.valueOf(travel)) {
                        case EXCURSION:
                            int quantityOfCities = 0;
                            if (scanner.hasNext()) {
                                quantityOfCities = scanner.nextInt();
                                if (travelValidator.isExceptionInt(duration, "Duration period", CITIES_FROM, CITIES_TO))
                                    quantityOfCities = 0;
                            }

                            oneTravel.addTravel(new ExcursionTravel(travelType, transportType, cateringType, duration,
                                        departurePoint, destinationPoint, quantityOfCities));
                            break;
                        case MEDICAL_TOURIZM:
                            String desease = scanner.next();
                            if (travelValidator.isExceptionString(desease))
                                desease = "";
                            oneTravel.addTravel(new MedicalTravel(travelType, transportType, cateringType, duration,
                                    departurePoint, destinationPoint, desease));
                            break;
                        default:
                            oneTravel.addTravel(new GeneralTravel(travelType, transportType, cateringType, duration,
                                    departurePoint, destinationPoint));
                            break;

                    }
                    counter++;
                    log.info("One item '" + travelType + "' was added");
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
            if (counter > 0) {
                log.info("Collection is filled up and contains " + counter + " elements. " +
                        "Now you can select your tour.");
            } else {
                log.info("Collection is NOT filled up! Check your file and try again.");
            }
            scanner.close();
        }
    }
}

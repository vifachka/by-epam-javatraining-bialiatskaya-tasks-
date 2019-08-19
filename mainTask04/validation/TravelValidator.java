/**
 * EPAM JavaTraining-Intro. Task 4.
 * VALIDATION: check if travel items wright
 *
 * @author Natallia Bialiatskaya
 * @version 1.0
 * @since 07.08.2019
 */
package by.epam.javatraining.bialiatskaya.tasks.mainTask04.validation;

import by.epam.javatraining.bialiatskaya.tasks.mainTask04.exceptions.DurationException;
import by.epam.javatraining.bialiatskaya.tasks.mainTask04.enums.*;

import org.apache.log4j.Logger;

public class TravelValidator {

    private static final Logger log = Logger.getLogger(TravelValidator.class);

    private static boolean catchException(String name, Exception e) {
        log.error("Argument for argument '" + name + "' is of wrong type.");
        e.printStackTrace();
        return false;
    }

    public static boolean isTravel(String travel, String transport, String catering, int duration, String departure,
                                   String destination){
        boolean isTravelOk = true;

        try {
            TravelType.valueOf(travel);
        } catch (IllegalArgumentException e) { isTravelOk = catchException("travel", e); }

        try {
            TransportType.valueOf(transport);
        } catch (IllegalArgumentException e) { isTravelOk = catchException("transport", e); }

        try {
            CateringType.valueOf(catering);
        } catch (IllegalArgumentException e) { isTravelOk = catchException("catering", e); }

        try {
            if (duration < 1 || duration > 60)
                throw new DurationException();
        } catch (DurationException e) { isTravelOk = e.myOwnExceptionMsg(); }

        try {
            DeparturePoint.valueOf(departure);
        } catch (IllegalArgumentException e) { isTravelOk = catchException("departure point", e); }

        try {
            DestinationPoint.valueOf(destination);
        } catch (IllegalArgumentException e) { isTravelOk = catchException("destination point", e); }

        return isTravelOk;
    }
}

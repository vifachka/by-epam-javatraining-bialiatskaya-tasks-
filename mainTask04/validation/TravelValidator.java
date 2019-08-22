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

    private static final int DURATION_FROM = 1;
    private static final int DURATION_TO = 60;

    public TravelValidator() {}

    private boolean catchException(String argument, String name, Exception e) {
        log.error("Argument '" + argument + "' for enum '" + name + "' is of wrong type.");
        e.printStackTrace();
        return false;
    }

    public boolean isExceptionString(String strValue) {
        boolean isException = false;

        try {
            String.valueOf(strValue);
        } catch (IllegalArgumentException e) {
            isException = true;
            log.error("Argument '" + strValue + "' is of wrong type.");
            e.printStackTrace();
        }
        return isException;
    }

    public boolean isExceptionInt(int quantity, String mes, int num1, int num2){
        boolean isException = false;

        try {
            if (quantity < num1 || quantity > num2) {
                isException = true;
                throw new DurationException();
            }
        } catch (DurationException e) {
            e.printStackTrace();
        }

        return isException;
    }

    public boolean isTravel(String travel, String transport, String catering, int duration, String departure,
                                   String destination){
        boolean isTravelOk = true;

        try {
            TravelType.valueOf(travel);
        } catch (IllegalArgumentException e) { isTravelOk = catchException(travel, "travel", e); }

        try {
            TransportType.valueOf(transport);
        } catch (IllegalArgumentException e) { isTravelOk = catchException(transport, "transport", e); }

        try {
            CateringType.valueOf(catering);
        } catch (IllegalArgumentException e) { isTravelOk = catchException(catering, "catering", e); }

        if (isExceptionInt(duration, "Duration period", DURATION_FROM, DURATION_TO))
          isTravelOk = false;

        try {
            City.valueOf(departure);
        } catch (IllegalArgumentException e) { isTravelOk = catchException(departure, "departure point", e); }

        try {
            City.valueOf(destination);
        } catch (IllegalArgumentException e) { isTravelOk = catchException(destination, "destination point", e); }

        return isTravelOk;
    }
}

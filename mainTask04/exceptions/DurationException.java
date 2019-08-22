/**
 * EPAM JavaTraining-Intro. Task 4.
 * My own exceptions class for duration period
 *
 * @author Natallia Bialiatskaya
 * @version 1.0
 * @since 07.08.2019
 */
package by.epam.javatraining.bialiatskaya.tasks.mainTask04.exceptions;

import org.apache.log4j.Logger;

public class DurationException extends Exception {

    private static final Logger log = Logger.getLogger(DurationException.class);

    public DurationException () {
        log.info("Exception is constructured: DurationException.");
    }

    public void myOwnExceptionMsg(String mes, int num1, int num2) {
        log.error(mes + " is out of bounds (" + num1 + ".." + num2 + "). DurationException is thrown.");
    }

}

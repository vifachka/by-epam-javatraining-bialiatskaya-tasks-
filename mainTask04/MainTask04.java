/**
 * EPAM JavaTraining-Intro. Task 4.
 * main class - dream to do it interactive
 *
 * @author Natallia Bialiatskaya
 * @version 1.0
 * @since 07.08.2019
 */
package by.epam.javatraining.bialiatskaya.tasks.mainTask04;

import org.apache.log4j.Logger;

public class MainTask04 {

    private static final Logger log = Logger.getLogger(MainTask04.class);

    public static void main(String[] args) {
        // какая-то логика
        log.info("Это сообщение info!");
        log.debug("Это сообщение debug!");
        log.error("Это сообщение error!");
        log.warn("Это сообщение warn!");
    }
}


/**
 * EPAM JavaTraining-Intro. Task 4.
 * Enum to store types of catering at travelling (виды питания)
 *
 * @author Natallia Bialiatskaya
 * @version 1.0
 * @since 07.08.2019
 */
package by.epam.javatraining.bialiatskaya.tasks.mainTask04.enums;

public enum CateringType {
    NON_AVAILABLE        ("non available"),      // without catering
    BREAKFAST_ONLY       ("breakfast only"),
    BUFFET_ONLY          ("buffet only"),        // шведский стол
    HALF_BOARD           ("half board"),         // полупансион
    ALL_INCLUSIVE        ("all inclusive"),
    BREAKFAST_AND_DINNER ("breakfast and dinner");

    private String cateringName;

    private CateringType(String cateringName) {
        this.cateringName = cateringName;
    }
}
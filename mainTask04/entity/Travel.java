/**
 * EPAM JavaTraining-Intro. Task 4.
 * Abstract class for travelling
 *
 * @author Natallia Bialiatskaya
 * @version 1.0
 * @since 07.08.2019
 */
package by.epam.javatraining.bialiatskaya.tasks.mainTask04.entity;

import by.epam.javatraining.bialiatskaya.tasks.mainTask04.enums.*;

abstract public class Travel {

    private TravelType travel;
    private TransportType transport;
    private CateringType catering;
    private int duration;
    private City departure;
    private City destination;

    public Travel(TravelType travel, TransportType transport, CateringType catering, int duration,
                  City departure, City destination){
        this.travel = travel;
        this.transport = transport;
        this.catering = catering;
        this.duration = duration;
        this.departure = departure;
        this.destination = destination;
    }

    public TravelType getTravel() {
        return travel;
    }

    public void setTravel(TravelType travel) {
        this.travel = travel;
    }

    public TransportType getTransport() {
        return transport;
    }

    public void setTransport(TransportType transport) {
        this.transport = transport;
    }

    public CateringType getCatering() {
        return catering;
    }

    public void setCatering(CateringType catering) {
        this.catering = catering;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public City getDeparture() {
        return departure;
    }

    public void setDeparture(City departure) {
        this.departure = departure;
    }

    public City getDestination() {
        return destination;
    }

    public void setDestination(City destination) {
        this.destination = destination;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        int hash = travel.ordinal() * 1_000_000 + transport.ordinal() * 100_000 + catering.ordinal() * 10_000 +
                departure.ordinal() * 1000 + destination.ordinal() * 100 + duration;
        return hash;
    }

    @Override
    public String toString() {
        return getTravel().toString() + " " + '\'' +
                ", transport='" + transport + '\'' +
                ", catering='" + catering + '\'' +
                ", duration=" + duration +
                ", departure='" + departure + '\'' +
                ", destination='" + destination;
    }
}

package org.example.Builder;

import org.example.ambulancias.Ambulancia;
import org.example.components.GPSNavigator;
import org.example.components.TripComputer;

public class CarBuilder implements Builder{

    private int seats;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;


    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Ambulancia getResult() {
        return new Ambulancia(transmission, tripComputer, gpsNavigator, seats);
    }
}

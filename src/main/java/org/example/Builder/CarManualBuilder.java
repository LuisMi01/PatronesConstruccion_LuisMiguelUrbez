package org.example.Builder;

import org.example.ambulancias.Manual;
import org.example.components.GPSNavigator;
import org.example.components.TripComputer;

public class CarManualBuilder implements Builder{

    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;


    @Override
    public void setSeats(int seats) {
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

    public Manual getResult() {
        return new Manual(transmission, tripComputer, gpsNavigator);
    }
}

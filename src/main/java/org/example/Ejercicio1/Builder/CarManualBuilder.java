package org.example.Ejercicio1.Builder;

import org.example.Ejercicio1.ambulancias.Manual;
import org.example.Ejercicio1.components.GPSNavigator;
import org.example.Ejercicio1.components.TripComputer;

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

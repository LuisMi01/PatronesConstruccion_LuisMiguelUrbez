package org.example.director;

import org.example.Builder.CarManualBuilder;
import org.example.components.GPSNavigator;
import org.example.components.TripComputer;

public class Director {
    public void construccionAmbulancia(CarManualBuilder builder) {
        builder.setSeats(2);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }
}




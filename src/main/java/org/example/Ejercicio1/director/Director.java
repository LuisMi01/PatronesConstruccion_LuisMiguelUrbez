package org.example.Ejercicio1.director;

import org.example.Ejercicio1.Builder.CarManualBuilder;
import org.example.Ejercicio1.components.GPSNavigator;
import org.example.Ejercicio1.components.TripComputer;

public class Director {
    public void construccionAmbulancia(CarManualBuilder builder) {
        builder.setSeats(2);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }
}




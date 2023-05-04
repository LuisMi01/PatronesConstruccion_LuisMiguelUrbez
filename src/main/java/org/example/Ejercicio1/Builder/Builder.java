package org.example.Ejercicio1.Builder;

import org.example.Ejercicio1.components.GPSNavigator;
import org.example.Ejercicio1.components.TripComputer;

public interface Builder {
    void setSeats(int seats);

    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}

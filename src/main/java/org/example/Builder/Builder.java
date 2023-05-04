package org.example.Builder;

import org.example.components.GPSNavigator;
import org.example.components.TripComputer;

public interface Builder {
    void setSeats(int seats);

    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}

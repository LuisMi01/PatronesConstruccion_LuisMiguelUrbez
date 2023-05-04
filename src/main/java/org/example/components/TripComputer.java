package org.example.components;

import org.example.ambulancias.Ambulancia;

public class TripComputer {

    private Ambulancia car;

    public void setCar(Ambulancia car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }
}

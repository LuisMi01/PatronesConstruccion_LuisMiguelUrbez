package org.example.Ejercicio1.components;

import org.example.Ejercicio1.ambulancias.Ambulancia;

public class TripComputer {

    private Ambulancia car;

    public void setCar(Ambulancia car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }
}

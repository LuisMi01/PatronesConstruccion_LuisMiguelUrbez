package org.example.Ejercicio2.components;

public abstract class Component {
    protected String manufacturer;
    protected String model;
    protected double price;

    public Component(String manufacturer, String model, double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}

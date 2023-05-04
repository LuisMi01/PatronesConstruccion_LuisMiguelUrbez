package org.example.Ejercicio2.components;

public class OutputDevice extends Component{
    protected int[] validPorts;

    public OutputDevice(String manufacturer, String model, double price, int[] validPorts) {
        super(manufacturer, model, price);
        this.validPorts = validPorts;
    }

    public int[] getValidPorts() {
        return validPorts;
    }
}

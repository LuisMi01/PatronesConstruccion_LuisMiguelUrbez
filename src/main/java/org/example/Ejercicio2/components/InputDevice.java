package org.example.Ejercicio2.components;

public class InputDevice extends Component{
    protected String connectorType;
    protected int[] validPorts;

    public InputDevice(String manufacturer, String model, double price, String connectorType, int[] validPorts) {
        super(manufacturer, model, price);
        this.connectorType = connectorType;
        this.validPorts = validPorts;
    }

    public String getConnectorType() {
        return connectorType;
    }

    public int[] getValidPorts() {
        return validPorts;
    }
}

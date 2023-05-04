package org.example.Ejercicio2.components;

public interface ComponentFactory {
    public CentralUnit createCentralUnit();
    public Keyboard createKeyboard(String connectorType, int[] validPorts);
    public Mouse createMouse(String connectorType, int[] validPorts);
    public GraphicTablet createGraphicTablet(String connectorType, int[] validPorts);
    public Screen createScreen(int[] validPorts);
    public InkjetPrinter createInkjetPrinter(String manufacturer, String model, int[] validPorts, String cartridgeType, int pagesPrinted);
    public LaserPrinter createLaserPrinter(String manufacturer, String model, int[] validPorts, String tonerType, int pagesPrinted);
}
}

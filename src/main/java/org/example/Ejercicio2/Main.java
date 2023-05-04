package org.example.Ejercicio2;

import org.example.Ejercicio2.app.Application;
import org.example.Ejercicio2.factories.GUIFactory;
import org.example.Ejercicio2.factories.MacOSFactory;
import org.example.Ejercicio2.factories.WindowsFactory;

public class Main {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}

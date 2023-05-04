package org.example.Ejercicio2.app;

import org.example.Ejercicio2.buttons.Button;
import org.example.Ejercicio2.checkboxes.Checkbox;
import org.example.Ejercicio2.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}

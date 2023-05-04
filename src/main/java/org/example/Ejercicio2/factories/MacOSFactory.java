package org.example.Ejercicio2.factories;

import org.example.Ejercicio2.buttons.Button;
import org.example.Ejercicio2.buttons.MacOSButton;
import org.example.Ejercicio2.checkboxes.Checkbox;
import org.example.Ejercicio2.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

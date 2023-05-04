package org.example.Ejercicio2.factories;

import org.example.Ejercicio2.buttons.Button;
import org.example.Ejercicio2.buttons.WindowsButton;
import org.example.Ejercicio2.checkboxes.Checkbox;
import org.example.Ejercicio2.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

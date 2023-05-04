package org.example.Ejercicio2.factories;

import org.example.Ejercicio2.buttons.Button;
import org.example.Ejercicio2.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

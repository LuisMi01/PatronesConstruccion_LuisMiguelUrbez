package org.example.builders;

import org.example.components.GPSNavigator;

public abstract class AmbulanciaBuilder {
    protected Builder base;

    public Builder getBase() {
        return base;
    }

    public void crearNuevaBase() {
        base = new Builder();
    }

    public abstract void construirNombre(String nombre);
    public abstract void construirNumAmbulancias(int numAmbulancias);
    public abstract void construirTiempoMedioAsistencia(int tiempoMedioAsistencia);
}

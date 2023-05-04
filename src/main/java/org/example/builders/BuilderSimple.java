package org.example.builders;

public class BuilderSimple {
    public void construirNombre(String nombre) {
        Builder.setNombre(nombre);
    }

    public void construirNumAmbulancias(int numAmbulancias) {
        Builder.setNumAmbulancias(numAmbulancias);
    }

    public void construirTiempoMedioAsistencia(int tiempoMedioAsistencia) {
        Builder.setTiempoMedioAsistencia(tiempoMedioAsistencia);
    }
}

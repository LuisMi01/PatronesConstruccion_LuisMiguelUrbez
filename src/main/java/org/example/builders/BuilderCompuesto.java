package org.example.builders;

public class BuilderCompuesto {
    public void construirNombre(String nombre) {
        Builder.setNombre(nombre);
    }

    public void construirNumAmbulancias(int numAmbulancias) {
        Builder.setNumAmbulancias(numAmbulancias);
    }

    public void construirTiempoMedioAsistencia(int tiempoMedioAsistencia) {
        Builder.setTiempoMedioAsistencia(tiempoMedioAsistencia);
    }

    public void agregarBaseSimple(AmbulanciaBuilder baseSimple) {
        int numAmbulanciasActuales = Builder.getNumAmbulancias();
        int tiempoMedioAsistenciaActual = Builder.getTiempoMedioAsistencia();

        Builder.agregarBaseSimple(baseSimple.getBase());
        Builder.setNumAmbulancias(numAmbulanciasActuales + baseSimple.getBase().getNumAmbulancias());
        Builder.setTiempoMedioAsistencia((tiempoMedioAsistenciaActual + baseSimple.getBase().getTiempoMedioAsistencia()) / 2);
    }
}

